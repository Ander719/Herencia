package herencia;

public class Moto extends Vehiculo{
	
	private boolean tieneSidecar;
		
	
	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}

		// setDatos
		public void setDatos() {
			super.setDatos();
			System.out.println("¿Tiene sidecar? ");
			tieneSidecar=sc.next().equalsIgnoreCase("Si");
		}
		
		//toString
		public String toString() {
			return "Es una moto con matricula "+getMatricula()+"y los caballos "+ super.getCaballos()+"[Tiene Sidecar=" + tieneSidecar + "]";
		}
}
