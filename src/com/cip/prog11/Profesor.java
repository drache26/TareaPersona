package com.cip.prog11;

public class Profesor extends Persona {

	// Atributos
	private double salario;

	// Constructor
	public Profesor(String nombre, int anyo, double salario) {
		super(nombre, anyo);
		this.salario = salario;
	}

	// Get y Set
	public void establecerSalario(int s) {
		salario = s;
	}

	public double dameSalario() {
		return salario;
	}

	// toString
	@Override
	public String toString() {
		String mensaje = "El profesor " + super.toString() + " , su salario es de  " + salario + " euros";
		return mensaje;
	}

	public double calculaDescuento(double c) {
		// TODO Auto-generated method stub
		double descuento = c * 0.02;
		return descuento;
	}
}
