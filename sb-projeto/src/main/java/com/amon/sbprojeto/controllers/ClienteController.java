package com.amon.sbprojeto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amon.sbprojeto.entidades.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedroso", "123.456.789-00");
	}
	
	
	@GetMapping("/{id}")
	public Cliente obterClientesPorId1(@PathVariable int id) {
		return new Cliente(id, "Januaria", "789.456.123-00");
	}

	
	@GetMapping
	public Cliente obterClientesPorId2(@RequestParam(name = "id") int id) {
		return new Cliente(id, "Etevaldo", "123.456.789-00");
	}

}
