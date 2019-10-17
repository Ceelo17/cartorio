package com.marcelo.cartorio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcelo.cartorio.domain.Cartorio;
import com.marcelo.cartorio.services.CartorioService;

@Controller
public class CartorioController {

	@Autowired
	private CartorioService service;

	@RequestMapping(value = "/cartorioCadastro")
	public ModelAndView formulario(Model model) {
		model.addAttribute("msg", "a jar packaging example");
		return new ModelAndView("cartorioCadastro");
	}

	@RequestMapping(value = "/cadastrarCartorio", method = RequestMethod.POST)
	public String cadastrar(@Valid @ModelAttribute("cartorio") Cartorio cartorio, BindingResult result,
			ModelMap model) {
		model.addAttribute("name", cartorio.getNome());
		service.criar(cartorio);
		return "cartorioCadastro";
	}

	@RequestMapping(value = "/listarCartorio", method = RequestMethod.GET)
	public String listar(@Valid @ModelAttribute("cartorio") Cartorio cartorio, BindingResult result, ModelMap model) {
		List<Cartorio> listaCartorios = service.findAll();
		model.addAttribute("cartorios",listaCartorios);
		return "cartorioLista";
	}

}