package com.cip.prog11;

public abstract class Persona {

	// Atributos
	private String nombre;
	private int anyo;

	// Constructor
	public Persona(String nombre, int anyo) {

		this.nombre = nombre;
		this.anyo = anyo;
	}

	// Get y Set
	public String dameNombre() {
		return nombre;
	}

	public int dameAnyo() {
		return anyo;
	}

	public void estableceNombre(String nombre) {
		this.nombre = nombre;

	}

	public void estableceAnyo(int anyo) {
		this.anyo = anyo;
	}

	// toString

	public String toString() {

		return "Se llama " + nombre + " y nació en el año " + anyo;
	}

	public abstract double calculaDescuento(double c);

}
