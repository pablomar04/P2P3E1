
public class luz {
	public String nombre = "Luz";
	public boolean encendida=false;
	
	public luz(String nombre, boolean encendida) {
		super();
		this.nombre = nombre;
		this.encendida = encendida;
	}
	
	public void encender(){
		this.encendida=true;
		System.out.println("Se encendió la luz");
		
	}
	
	

}
