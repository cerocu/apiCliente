package com.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Cliente;
import com.api.modelo.service.ClienteServiceImplement;
import com.api.modelo.service.ICliente;

@Controller
@RestController
@RequestMapping("/NutriNets")
@Component
public class controladors {
 //
	@Autowired 
	ClienteServiceImplement clienteService;
	
	@RequestMapping(value="/Cliente/{id}",method=RequestMethod.GET)  
    public Cliente getClientes(@PathVariable Integer id) {
    	 return clienteService.findById(id);
    }
	
	@RequestMapping(value="/Cliente",method=RequestMethod.POST)  
    public void addClientes(@RequestBody Cliente cliente) {
		clienteService.addCliente(cliente);
    }
	
    
	
}
