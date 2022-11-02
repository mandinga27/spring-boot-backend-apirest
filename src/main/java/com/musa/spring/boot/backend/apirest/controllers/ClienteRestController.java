package com.musa.spring.boot.backend.apirest.controllers;

import java.util.List;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;
import com.musa.spring.boot.backend.apirest.models.services.IclienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api") //url de primer nivel
public class ClienteRestController {

    @Autowired
    private IclienteService clienteService;

    @GetMapping("/clientes") //url de segundo nivel que es para el metodo
    public List<Cliente> index() {
        return clienteService.findAll();
    }
}
