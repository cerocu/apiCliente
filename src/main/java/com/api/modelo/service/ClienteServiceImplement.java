package com.api.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.api.entity.Cliente;
import com.api.modelo.repository.ClienteRepository;


@Service
public class ClienteServiceImplement implements ICliente{
   @Autowired
     ClienteRepository clienteRepositorio; 	
	
	@Override
	public Cliente findById(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepositorio.findById(id).get();
	}
	
	
	@Override
	public Cliente addCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		 return clienteRepositorio.save(cliente);
	}
	public List<Cliente> findAll() {
		return clienteRepositorio.findAll();
	}
	public Cliente updateCliente(Cliente cliente) {
		  return clienteRepositorio.save(cliente);
	}

}
