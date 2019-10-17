package com.marcelo.cartorio.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.marcelo.cartorio.domain.Cartorio;
import com.marcelo.cartorio.services.CartorioService;

@RestController
@RequestMapping(value = "/cartorios")
public class CartorioResource {

	// Controlador REST acessa o serviço
	@Autowired
	private CartorioService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cartorio> visualizar(@PathVariable Integer id) {

		Cartorio obj = service.visualizar(id);

		// Retorna resposta pronta em http
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/criarCartorio", method = RequestMethod.POST)
	public ResponseEntity<Void> criar(@RequestBody Cartorio obj) {
		obj = service.criar(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();

	}

}
