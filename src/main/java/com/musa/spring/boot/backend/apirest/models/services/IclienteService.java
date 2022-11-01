package com.musa.spring.boot.backend.apirest.models.services;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IclienteService {

    public List<Cliente> findAll();
    //metodo para listar todos los clientes -> findall
}
