package com.api.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
    private Integer id;
	private String nombreUsuario;
	private String contrasena;
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private Integer edad;
	private double estatura ;
	private double peso;
	private double imc;
	private double geb;
	private double eta;
	private Date  fechaCreacion;
	private Date fechaActualizacion;
	public Integer getArticleId() {
		return id;
	}
	public void setArticleId(Integer articleId) {
		this.id = articleId;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return contrasena;
	}
	public void setContraseña(String contraseña) {
		this.contrasena = contraseña;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getImc() {
		return imc;
	}
	public void setImc(double imc) {
		this.imc = imc;
	}
	public double getGeb() {
		return geb;
	}
	public void setGeb(double geb) {
		this.geb = geb;
	}
	public double getEta() {
		return eta;
	}
	public void setEta(double eta) {
		this.eta = eta;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
