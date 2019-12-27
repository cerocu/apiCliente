package com.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/NutriNet")
@Component
public class controlador {
 //
	@Autowired 
	ClienteServiceImplement clienteService;
	@Autowired
	Salida salida;
	
	@RequestMapping(value="/Cliente/{id}",method=RequestMethod.GET)  
    public Cliente getCliente(@PathVariable Integer id) {
    	 return clienteService.findById(id);
    }
	@RequestMapping(value="/Cliente",method=RequestMethod.GET)  
    public List<Cliente> getClientes() {
    	 return clienteService.findAll();
    }
	
	
	@RequestMapping(value="/Cliente",method=RequestMethod.POST)  
    public Salida addClientes(@RequestBody Cliente cliente) {
		cliente.setFechaCreacion(fechaActual());
		try {
			salida.setCve_mensaje(clienteService.addCliente(cliente));
			salida.setCve_error(0);
			
		}catch(Exception e) {
			salida.setCve_error(-1);
			salida.setCve_mensaje("Error interno");
		}
		return salida;
		
    }
	
	@RequestMapping(value="/Cliente/{id}",method=RequestMethod.PUT)  
    public Salida putClientes(@RequestBody Cliente cliente, @PathVariable Integer id) {
		Cliente nuevoCliente=clienteService.findById(id);
		nuevoCliente.setEdad(cliente.getEdad());
		nuevoCliente.setEstatura(cliente.getEstatura());
		nuevoCliente.setGeb(cliente.getGeb());
		nuevoCliente.setPeso(cliente.getPeso());
		nuevoCliente.setFechaActualizacion(fechaActual());
		
		try{
			salida.setCve_mensaje(clienteService.updateCliente(nuevoCliente));
			salida.setCve_error(0);
		}catch(Exception e) {
			salida.setCve_error(-1);
			salida.setCve_mensaje("Error interno");
		}
		return salida;
    }
	
	private Date fechaActual() {
		Date objDate = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 
		 
        System.out.println(objDate); 
        String strDateFormat = "hh: mm: ss a dd-MMM-aaaa"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto 
        System.out.println(objSDF.format(objDate)); 
        
        //return objSDF.format(objDate).;
        return objDate;
	}
	
    
	
}
