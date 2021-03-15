package com.test;

public class ProgramaExecutar {

	public static void main(String[] args) {
		ElMeuNombre nombre1 = new ElMeuNombre (5);
		ElMeuNombre nombre2 = new ElMeuNombre (8);
		System.out.println("El nombre 1 = " + nombre1.getNombre());
		System.out.println("El nombre 2 = " + nombre2.getNombre());
		System.out.println("Suma nombre 1 i nombre 2 = " + nombre1.suma(nombre2).getNombre());



	}

}
