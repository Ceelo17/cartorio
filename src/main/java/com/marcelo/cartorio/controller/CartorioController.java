package com.marcelo.cartorio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.marcelo.cartorio.domain.Cartorio;
import com.marcelo.cartorio.services.CartorioService;

@Controller
@RequestMapping("/cartorio")
public class CartorioController {

	@Autowired
	private CartorioService service;

	// Método que Abre o formulário para cadastro

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView cartorio(Model model) {
		List<Cartorio> listaCartorios = service.findAll();
		model.addAttribute("cartorios", listaCartorios);
		return new ModelAndView("cartorioCadastro");
	}

	// Método que cadastra um cartório

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String cadastrar(@Valid @ModelAttribute("cartorio") Cartorio cartorio, BindingResult result,
			ModelMap model) {
		model.addAttribute("name", cartorio.getNome());
		service.criar(cartorio);
		return "redirect:/cartorio";
	}

	// Método que Abre o formulário para listagem

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(@Valid @ModelAttribute("cartorio") Cartorio cartorio, BindingResult result, ModelMap model) {
		List<Cartorio> listaCartorios = service.findAll();
		model.addAttribute("cartorios", listaCartorios);
		return "cartorioLista";
	}

	// Método que Abre o formulário para atualização

	@RequestMapping(value = "/atualizarForm/{id}")
	public String atualizaForm(@PathVariable("id") Integer id, Model model) {
		Cartorio cartorio = service.visualizar(id);
		model.addAttribute("cartorio", cartorio);
		return "cartorioAtualiza";
	}

	// Método que atualiza um cartório

	@RequestMapping(value = "/atualizar/{id}", method = RequestMethod.POST)
	public String atualizar(@PathVariable("id") Integer id, @Valid Cartorio cartorio, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			cartorio.setId(id);
			return "cartorioCadastro";
		}

		service.update(cartorio);
		model.addAttribute("cartorios", service.findAll());
		return "redirect:/cartorio";
	}

	// Método que deleta um cartório

	@RequestMapping(value = "/{id}/deletar", method = RequestMethod.GET)
	public String deletar(@PathVariable Integer id) {
		service.Excluir(id);
		return "redirect:/cartorio";
	}

}