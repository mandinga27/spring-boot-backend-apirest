package com.musa.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	//DAO Data Access Object
	//las clases DAO su funcion es acceder, realizar consultas a una base de datos
	
}
