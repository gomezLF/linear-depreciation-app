package model;

import java.time.LocalDate;

public class ActivoNoDepreciable extends Activo {
	
	public ActivoNoDepreciable(String nombre, double costo, String categoria, LocalDate fechaRegistro, String descripcionRegistro) {
		super(nombre, costo, categoria, fechaRegistro, descripcionRegistro);
	}
	
}
