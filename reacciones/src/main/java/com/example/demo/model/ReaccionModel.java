package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reaccion")
public class ReaccionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idReaccion;
	
	private long idPublicacion;
	private long idUsuario;
	private long idTipoReaccion;
	public long getIdReaccion() {
		return idReaccion;
	}
	public void setIdReaccion(long idReaccion) {
		this.idReaccion = idReaccion;
	}
	public long getIdPublicacion() {
		return idPublicacion;
	}
	public void setIdPublicacion(long idPublicacion) {
		this.idPublicacion = idPublicacion;
	}
	public long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public long getIdTipoReaccion() {
		return idTipoReaccion;
	}
	public void setIdTipoReaccion(long idTipoReaccion) {
		this.idTipoReaccion = idTipoReaccion;
	}
	
	

}
