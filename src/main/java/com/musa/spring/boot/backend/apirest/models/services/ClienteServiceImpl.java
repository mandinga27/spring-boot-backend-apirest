package com.musa.spring.boot.backend.apirest.models.services;

import com.musa.spring.boot.backend.apirest.models.dao.IClienteDao;
import com.musa.spring.boot.backend.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //tipo de estereotipo de component, la decora, es un beans
public class ClienteServiceImpl implements IclienteService{

    @Autowired //autowired inyeccion de dependencias, cliente dao
    private IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
