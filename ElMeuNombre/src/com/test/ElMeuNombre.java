package com.test;

public class ElMeuNombre {
	private int nombre;
	
	public ElMeuNombre(int nombreRebut) {
		this.nombre = nombreRebut;
	}
	
	public int getNombre() {
		return nombre;
	}

	public ElMeuNombre suma(ElMeuNombre unAltre) {
		return new ElMeuNombre(this.nombre + unAltre.nombre);
	}
	public ElMeuNombre resta(ElMeuNombre unAltre) {
		return new ElMeuNombre(this.nombre - unAltre.nombre);
	}
	public ElMeuNombre prod(ElMeuNombre unAltre) {
		return new ElMeuNombre(this.nombre * unAltre.nombre);
	}
	public ElMeuNombre div(ElMeuNombre unAltre) {
		return new ElMeuNombre(this.nombre / unAltre.nombre);
	}
}
