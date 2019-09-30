package com.backend.rest.vo;

public class EquipoVO {

	private int equserial;
	private int numerolinea;
	private String marca;
	private String descripcion;
	private String estado;
	
	public EquipoVO ()  {
		super();
	}
	
	public EquipoVO(int equserial,int numerolinea,String marca, String descripcion, String estado) {
		super();
		this.equserial=equserial;
		this.numerolinea=numerolinea;
		this.marca=marca;
		this.descripcion=descripcion;
		this.estado=estado;
	}
	
	
	
	public int getEquserial() {
		return equserial;
	}
	public void setEquserial(int equserial) {
		this.equserial = equserial;
	}
	public int getNumerolinea() {
		return numerolinea;
	}
	public void setNumerolinea(int numerolinea) {
		this.numerolinea = numerolinea;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	
	
}
