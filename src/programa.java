import java.util.Vector;

public class programa {

	public static void main(String[] args) {
		
		Timbre t1= new Timbre("T1",false);
		luz l1 = new luz("luz 1", false);
	//	alarmaluminosa a1 = new alarmaluminosa(true,false,false,t1,l1);
		sensor s1 = new sensor (false,"habitacion 1","vidrio");
		sensor s2 = new sensor (false,"habitacion 2","vidrio");
		sensor s3 = new sensor (true,"comedor","movimiento");
		sensor s4 = new sensor (true,"cocina","abertura");
		Vector <sensor> sensores= new Vector<sensor>();
		
		sensores.add(s1);
		sensores.add(s2);
		sensores.add(s3);
		sensores.add(s4);
		
		alarmasensores a1 = new alarmasensores(sensores, t1, l1);
	
		a1.comprobar();
	}

}
