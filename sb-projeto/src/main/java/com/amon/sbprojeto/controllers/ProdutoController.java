package com.amon.sbprojeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amon.sbprojeto.entidades.Produto;
import com.amon.sbprojeto.repositorios.ProdutoRepositorio;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {	//efetuada as validações atraves do @valid
		produtoRepositorio.save(produto);
		return produto;
	}

}
