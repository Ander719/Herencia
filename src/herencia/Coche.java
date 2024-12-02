package herencia;

import java.util.Scanner;

public class Coche extends Vehiculo {
	Scanner sc = new Scanner (System.in);
	
	private Integer puertas;

	public Integer getPuertas() {
		return puertas;
	}

	public void setPuertas(Integer puertas) {
		this.puertas = puertas;
	}

	// setDatos
	public void setDatos() {
		super.setDatos();
		System.out.println("Introduce el numero de puertas: ");
		puertas=sc.nextInt();	
	}
	
	//toString
	public String toString() {
		return super.toString()+"Coche [puertas=" + puertas + "]";
	}
	

}
