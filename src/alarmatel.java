import java.util.Vector;


public class alarmatel extends alarmasensores {
	
	Telefono tel;
	
	
	
	public alarmatel(Vector<sensor> sensores, Timbre timbre, luz lampara,
			Telefono tel) {
		super(sensores, timbre, lampara);
		this.tel = tel;
	}



	public void verEstado(){
		
		if(tel.numeroSeguro(this.sensores)){
			System.out.println("No hay alarma activada");
		}else{
			System.out.println("ALARMA ACTIVADA");
		}
	}



}
