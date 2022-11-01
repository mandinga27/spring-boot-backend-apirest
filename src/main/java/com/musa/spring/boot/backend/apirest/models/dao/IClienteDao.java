package com.musa.spring.boot.backend.apirest.models.dao;

import com.musa.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
    //tipo de dato de la llave id -> long
    //DAO Data Access Object
    //las clases DAO su funcion es acceder, realizar consultas a una base de datos
    //esto es una interfaz que no tiene implmentacion
    //spring data jpa ahora mucho codigo en un crud ya que importa todos los metodos de la clase cliente -> GET, POST, etc
    //metodos customizados -> @query
}
