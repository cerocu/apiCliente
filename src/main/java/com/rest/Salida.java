package com.rest;

import org.springframework.stereotype.Component;

@Component
public class Salida {
	private int cve_error;
	private Object cve_mensaje;
	public int getCve_error() {
		return cve_error;
	}
	public void setCve_error(int cve_error) {
		this.cve_error = cve_error;
	}
	public Object getCve_mensaje() {
		return cve_mensaje;
	}
	public void setCve_mensaje(Object cve_mensaje) {
		this.cve_mensaje = cve_mensaje;
	}
	

}
