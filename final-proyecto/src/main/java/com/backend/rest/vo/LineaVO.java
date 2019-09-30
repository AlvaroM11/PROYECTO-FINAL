package com.backend.rest.vo;

public class LineaVO {

	private String numerolinea;
	private int perid;
	private String estado;
	
	
	
	public LineaVO() {
		super();
	}
	public LineaVO(String numerolinea, int perid, String estado) {
		super();
		this.numerolinea = numerolinea;
		this.perid = perid;
		this.estado = estado;
	}
	public String getNumerolinea() {
		return numerolinea;
	}
	public void setNumerolinea(String numerolinea) {
		this.numerolinea = numerolinea;
	}
	public int getPerid() {
		return perid;
	}
	public void setPerid(int perid) {
		this.perid = perid;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
