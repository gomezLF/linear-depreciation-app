package model;

import java.time.LocalDate;

public abstract class Activo {
	
	private String nombre;
	private double costo;
	private String categoria;
	private LocalDate fechaRegistro;
	private LocalDate fechaRetiro;
	private String descripcionRegistro;
	private String descripcionRetirado;
	private boolean retirado;
	
	
	public Activo(String nombre, double costo, String categoria, LocalDate fechaRegistro, String descripcionRegistro) {
		this.nombre = nombre;
		this.costo = costo;
		this.categoria = categoria;
		this.fechaRegistro = fechaRegistro;
		this.descripcionRegistro = descripcionRegistro;
		
		fechaRetiro = null;
		descripcionRetirado = "";
		retirado = false;
	}


	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the costo
	 */
	protected double getCosto() {
		return costo;
	}


	/**
	 * @param costo the costo to set
	 */
	protected void setCosto(double costo) {
		this.costo = costo;
	}


	/**
	 * @return the categoria
	 */
	protected String getCategoria() {
		return categoria;
	}


	/**
	 * @param categoria the categoria to set
	 */
	protected void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	/**
	 * @return the fechaRegistro
	 */
	protected LocalDate getFechaRegistro() {
		return fechaRegistro;
	}


	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	protected void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	/**
	 * @return the fechaRetiro
	 */
	protected LocalDate getFechaRetiro() {
		return fechaRetiro;
	}


	/**
	 * @param fechaRetiro the fechaRetiro to set
	 */
	protected void setFechaRetiro(LocalDate fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}


	/**
	 * @return the descripcionRegistro
	 */
	protected String getDescripcionRegistro() {
		return descripcionRegistro;
	}


	/**
	 * @param descripcionRegistro the descripcionRegistro to set
	 */
	protected void setDescripcionRegistro(String descripcionRegistro) {
		this.descripcionRegistro = descripcionRegistro;
	}


	/**
	 * @return the descripcionRetirado
	 */
	protected String getDescripcionRetirado() {
		return descripcionRetirado;
	}


	/**
	 * @param descripcionRetirado the descripcionRetirado to set
	 */
	protected void setDescripcionRetirado(String descripcionRetirado) {
		this.descripcionRetirado = descripcionRetirado;
	}


	/**
	 * @return the retirado
	 */
	protected boolean isRetirado() {
		return retirado;
	}


	/**
	 * @param retirado the retirado to set
	 */
	protected void setRetirado(boolean retirado) {
		this.retirado = retirado;
	}

	
	
	
	
	
}
