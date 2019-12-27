package com.api.modelo.service;

import com.api.entity.Cliente;

public interface ICliente  {
	public Cliente findById(Integer id);
	public Cliente addCliente(Cliente cliente);
	

}
