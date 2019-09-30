package com.backend.rest.vo;

public class FacturaVO {

	private int facnumero;
	private int  numerolienas;
	private int facfechaemision;
	private double valor;
	
	
	public FacturaVO() {
		super();
	}
	
	public FacturaVO(int facnumero,int numerolineas,int facfechaemision,double valor) {
		super();
		this.facnumero=facnumero;
		this.numerolienas=numerolineas;
		this.facfechaemision=facfechaemision;
		this.valor=valor;
	}
	
	public int getFacnumero() {
		return facnumero;
	}
	public void setFacnumero(int facnumero) {
		this.facnumero = facnumero;
	}
	public int getNumerolienas() {
		return numerolienas;
	}
	public void setNumerolienas(int numerolienas) {
		this.numerolienas = numerolienas;
	}
	public int getFacfechaemision() {
		return facfechaemision;
	}
	public void setFacfechaemision(int facfechaemision) {
		this.facfechaemision = facfechaemision;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
