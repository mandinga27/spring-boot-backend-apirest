package com.musa.spring.boot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.musa.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.musa.spring.boot.backend.apirest.models.entity.Cliente;

@Service //tipo de estereotipo de component, la decora, es un beans
public class ClienteServiceImpl implements IClienteService{

	@Autowired //autowired inyeccion de dependencias, cliente dao
	private IClienteDao clienteDao;
	
	@Override 
	@Transactional(readOnly = true)
	public List<Cliente> findAllList() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}


	@Override
	public List<Cliente> findAll() {
		return null;
	}
}
