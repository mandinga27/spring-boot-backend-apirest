package com.musa.spring.boot.backend.apirest.models.services;

import java.util.List;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.transaction.annotation.Transactional;


public interface IClienteService {

    @Transactional(readOnly = true)
    List<Cliente> findAllList();

    public List<Cliente> findAll ();
	//metodo para listar todos los clientes -> findall
}
