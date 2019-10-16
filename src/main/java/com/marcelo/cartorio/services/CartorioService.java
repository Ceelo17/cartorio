package com.marcelo.cartorio.services;

import java.util.List;
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

	// Método para criar um cartório

	public Cartorio criar(Cartorio obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	// Método para editar um cartório

	public Cartorio update(Cartorio obj) {
		visualizar(obj.getId());
		return repo.save(obj);
	}

	// Método para excluir um cartório
	public void Excluir(Integer id) {
		visualizar(id);

		repo.deleteById(id);
	}

	// Método para listar todos os cartórios
	public List<Cartorio> findAll() {
		return repo.findAll();
	}

}
