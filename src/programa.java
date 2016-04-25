import java.util.Vector;

public class programa {

	public static void main(String[] args) {
		
		Timbre t1= new Timbre("T1",false);
		luz l1 = new luz("luz 1", false);
	//	alarmaluminosa a1 = new alarmaluminosa(true,false,false,t1,l1);
		sensor s1 = new sensor (false,"habitacion 1","vidrio");
		sensor s2 = new sensor (false,"habitacion 2","vidrio");
		sensor s3 = new sensor (false,"comedor","movimiento");
		sensor s4 = new sensor (false,"cocina","abertura");
		Vector <sensor> sensores= new Vector<sensor>();
		
		sensores.add(s1);
		sensores.add(s2);
		sensores.add(s3);
		sensores.add(s4);
		
		//alarmasensores a1 = new alarmasensores(sensores, t1, l1);
		Telefono tel = new Telefono(1552);
		alarmatel a1 = new alarmatel(sensores, t1, l1,tel);
		a1.verEstado();
	}

}
