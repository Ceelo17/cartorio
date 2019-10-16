package com.marcelo.cartorio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.cartorio.domain.Cartorio;
import com.marcelo.cartorio.repository.CartorioRepository;

@Service
public class CartorioService {

	// Declarar objeto para acesso a dados
	// Método para instanciar automáticamente

	@Autowired
	private CartorioRepository repo;

	// Método para buscar por id
	// Objeto pode retornar vazio por isso a utilização do Optional

	public Cartorio visualizar(Integer id) {
		Optional<Cartorio> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
