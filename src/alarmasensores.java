import java.util.Vector;

public class alarmasensores {
	
	Vector <sensor> sensores=null;
	Timbre timbre;
	luz lampara;

	
	
	public alarmasensores(Vector<sensor> sensores, Timbre timbre, luz lampara) {
		super();
		this.sensores = sensores;
		this.timbre = timbre;
		this.lampara = lampara;
	}



	public void agregarSensor (sensor s){
		
		sensores.addElement(s);
		
	}
	
	public void comprobar(){
			boolean aux=false;
			sensor s;
			for(int i=0;i<sensores.size();i++){
				s = sensores.elementAt(i);
				if (s.estado){
					aux=true;
					System.out.println("Sensor tipo: "+s.tipo);
					System.out.println("Sensor zona: "+s.zona);
					System.out.println("-------------------------");
				}
				
				
			}
			if (aux){
				timbre.hacerSonar();
				lampara.encender();
			}
			
		
	}
	
	

}
