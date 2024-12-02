package herencia;

import java.util.Scanner;

public class Vehiculo {
	//Scanner
	Scanner sc = new Scanner (System.in);
	
	//Atributos
	private String matricula;
	private int caballos;
	
	// Getters y setters
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	// Metodos
	public void setDatos() {
		System.out.println("Introduce la matricula: ");
		matricula=sc.next();
		System.out.println("Introduce los caballos: ");
		caballos=sc.nextInt();		
	}
	
	//toString
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", caballos=" + caballos + "]";
	}
	
}
