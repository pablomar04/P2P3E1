
public class programa {

	public static void main(String[] args) {
		
		Timbre t1= new Timbre("T1",false);
		alarma a1 = new alarma(false,true,false,t1);

		a1.comprobar();
	}

}
