package com.musa.spring.boot.backend.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;
import com.musa.spring.boot.backend.apirest.models.services.IClienteService;


@RestController //anotation
@RequestMapping("/api") //mapeamos
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/clientes")
	public List<Cliente> index() {
		return clienteService.findAll();
	}
}
