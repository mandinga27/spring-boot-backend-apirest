package com.musa.spring.boot.backend.apirest.models.services;

import java.util.List;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;


public interface IClienteService {
	
	public List<Cliente> findAll ();
	//metodo para listar todos los clientes -> findall
}
