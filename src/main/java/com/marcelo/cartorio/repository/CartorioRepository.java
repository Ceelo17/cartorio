package com.marcelo.cartorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcelo.cartorio.domain.Cartorio;

@Repository
public interface CartorioRepository extends JpaRepository<Cartorio, Integer> {

}
