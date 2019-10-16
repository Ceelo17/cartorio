package com.marcelo.cartorio.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.cartorio.domain.Cartorio;

@RestController
@RequestMapping(value = "/cartorios")
public class CartorioResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Cartorio> listar() {

		Cartorio car1 = new Cartorio(null, "Cartório1");
		Cartorio car2 = new Cartorio(null, "Cartorio2");

		List<Cartorio> lista = new ArrayList<>();
		lista.add(car1);
		lista.add(car2);

		return lista;
	}

}
