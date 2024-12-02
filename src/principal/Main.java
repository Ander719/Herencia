package principal;

import herencia.Coche;
import herencia.Moto;
import herencia.Vehiculo;

public class Main {

	public static void main(String[] args) {
		
		//Voy a crear un vehiculo
		Vehiculo veh = new Vehiculo ();
		veh.setDatos (); 
		System.out.println("El vehiculo introducido es: "+veh);
	
		//Voy a crear un coche
		// 1. Coche coche = new Coche ();
		veh = new Coche ();
		veh.setDatos();
		System.out.println("El coche introducido es: "+veh);
		//Voy a crear una moto
		veh = new Moto ();
		veh.setDatos();
		System.out.println("La moto introducida es: "+veh);	
	
	}

}
