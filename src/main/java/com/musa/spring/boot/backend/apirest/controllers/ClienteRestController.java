package com.musa.spring.boot.backend.apirest.controllers;

import java.util.Date;
import java.util.List;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;
import com.musa.spring.boot.backend.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api") //url de primer nivel
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes") //url de segundo nivel que es para el metodo
    public List<Cliente> index() {
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}") //url de segundo nivel que es para el metodo
    public Cliente show(@PathVariable Long id) {
        return this.clienteService.findById(id);
    }

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        cliente.setCreateAt(new Date());
        this.clienteService.save(cliente);
        return cliente;
    }

    @PutMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente update(@RequestBody Cliente cliente, @PathVariable Long id) {
        Cliente clienteActual = this.clienteService.findById(id);
        clienteActual.setNombre(cliente.getNombre());
        clienteActual.setApellido(cliente.getApellido());
        clienteActual.setEmail(cliente.getEmail());
        this.clienteService.save(clienteActual);
        return clienteActual;
    }

    @DeleteMapping("/clientes/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Cliente clienteActual = this.clienteService.findById(id);
        this.clienteService.delete(clienteActual);
    }

}
