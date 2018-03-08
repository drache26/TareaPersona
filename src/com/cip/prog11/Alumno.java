package com.cip.prog11;

public class Alumno extends Persona {

	// Atributos
	private String curso;

	// Constructor
	public Alumno(String nombre, int anyo, String curso) {
		super(nombre, anyo);
		this.curso = curso;
	}

	// Get y Set
	/*
	 * public String getCurso() { return curso; }
	 */
	// setter
	public void estableceCurso(String c) {
		curso = c;
	}

	public String dameCurso() {

		return curso;
	}

	// toString

	public String toString() {
		String mensaje = "El alumno " + super.toString() + " está en " + curso;
		return mensaje;
	}

	@Override
	public double calculaDescuento(double c) {
		// TODO Auto-generated method stub
		double descuento = c * 0.1;
		return descuento;
	}

}
