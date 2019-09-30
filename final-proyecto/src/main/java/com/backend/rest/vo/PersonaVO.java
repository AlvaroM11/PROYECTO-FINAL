package com.backend.rest.vo;

public class PersonaVO {

	private int perid;
	private String nombre;
	private String apellido;
	private String telefonofijo;
	private String fecnacimiento;
	private String documento;
	
	
	
	public PersonaVO() {
		super();
	}



	public PersonaVO(int perid, String nombre, String apellido, String telefonofijo, String fecnacimiento,
			String documento) {
		super();
		this.perid = perid;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonofijo = telefonofijo;
		this.fecnacimiento = fecnacimiento;
		this.documento = documento;
	}



	public int getId() {
		return perid;
	}



	public void setId(int perid) {
		this.perid = perid;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTelefonofijo() {
		return telefonofijo;
	}



	public void setTelefonofijo(String telefonofijo) {
		this.telefonofijo = telefonofijo;
	}



	public String getFecnacimiento() {
		return fecnacimiento;
	}



	public void setFecnacimiento(String fecnacimiento) {
		this.fecnacimiento = fecnacimiento;
	}



	public String getDocumento() {
		return documento;
	}



	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
}
