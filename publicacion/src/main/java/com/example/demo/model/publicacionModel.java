package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table (name = "publicacion")
public class publicacionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPublicacion;
	
	private long idUsusario;
	private String texto;
	private String fecha;
	public long getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
	public long getIdUsusario() {
		return idUsusario;
	}
	public void setIdUsusario(long idUsusario) {
		this.idUsusario = idUsusario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
