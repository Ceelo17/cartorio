package com.marcelo.cartorio.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cartorios")
public class CartorioResource {

	@RequestMapping(method = RequestMethod.GET)	
	public String listar() {
		return "REST esta funcionando";
	}

}
