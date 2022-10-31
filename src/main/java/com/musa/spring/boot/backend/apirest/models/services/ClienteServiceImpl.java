package com.musa.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.musa.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.musa.spring.boot.backend.apirest.models.entity.Cliente;

public class ClienteServiceImpl implements IClienteService{

	@Autowired //autowired inyeccion de dependencias
	private IClienteDao clienteDao;
	
	@Override 
	public List<Cliente> findAllList() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

	
}
