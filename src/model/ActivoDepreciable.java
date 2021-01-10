package model;

import java.time.LocalDate;

public class ActivoDepreciable extends Activo {
	
	private double depreciacionAcumulada;
	
	
	public ActivoDepreciable(String nombre, double costo, String categoria, LocalDate fechaRegistro, String descripcionRegistro) {
		super(nombre, costo, categoria, fechaRegistro, descripcionRegistro);
		
		depreciacionAcumulada = 0.0;
	}
	
	
}
