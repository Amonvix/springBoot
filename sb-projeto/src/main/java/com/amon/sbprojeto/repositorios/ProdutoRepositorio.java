package com.amon.sbprojeto.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.amon.sbprojeto.entidades.Produto;

public interface ProdutoRepositorio extends CrudRepository<Produto, Integer>{
	
	
}
