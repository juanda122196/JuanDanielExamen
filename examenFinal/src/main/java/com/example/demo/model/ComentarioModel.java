package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "comentario")
public class ComentarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idComentario;
	
	private long idUsuario;
	private long idPublicacion;
	private String comentario;
	public long getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(long idComentario) {
		this.idComentario = idComentario;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public long getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
