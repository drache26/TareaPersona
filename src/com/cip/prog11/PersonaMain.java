package com.cip.prog11;



public class PersonaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona profesor1 = new Profesor("María", 1965, 1300);
                  System.out.println(profesor1.toString()+ "\n"+ "Le corresponde de descuento " + profesor1.calculaDescuento(100));
		Persona profesor2 = new Profesor("Lucas", 1984, 1400);
                   System.out.println(profesor2.toString()+ "\n"+ "Le corresponde de descuento " + profesor2.calculaDescuento(50));
		Persona profesor3 = new Profesor("Carlos",1978, 1200);
                     System.out.println(profesor3.toString());
		Persona alumno1 = new Alumno("Juan", 1999, "1º bachiller");
                    System.out.println(alumno1.toString()+ "\n"+ "Le corresponde de descuento " + alumno1.calculaDescuento(12));
		Persona alumno2 = new Alumno("Diana", 2000, "1º bachiller");
                    System.out.println(alumno2.toString());
		Persona alumno3 = new Alumno("Julia", 2005, "4º Primaria");
                    System.out.println(alumno3.toString()+ "\n"+ "Le corresponde de descuento " + alumno3.calculaDescuento(30));

		

	}

}
