
public class Timbre {
	String nombre="Chicharra";
	boolean encendido=false;

	public Timbre(String nombre, boolean enc) {
		super();
		this.nombre = nombre;
		this.encendido=enc;
	}


	public void hacerSonar(){
		this.encendido=true;
		System.out.println("El timbre está sonando");
	}

}
