package com.musa.spring.boot.backend.apirest.models.services;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> findAll();

    public void save(Cliente cliente);
    //metodo para listar todos los clientes -> findall
    public Cliente findById(Long id);

    //public void (Cliente cliente);

    public void delete(Cliente cliente);
}
