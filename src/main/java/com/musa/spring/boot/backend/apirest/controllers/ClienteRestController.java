package com.musa.spring.boot.backend.apirest.controllers;

import com.musa.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.musa.spring.boot.backend.apirest.models.entity.Cliente;
import com.musa.spring.boot.backend.apirest.models.services.IclienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ClienteRestController {

    @Autowired
    private IclienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index() {
        return clienteService.findAll();
    }
}
