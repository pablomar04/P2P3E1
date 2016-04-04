
public class programa {

	public static void main(String[] args) {
		
		Timbre t1= new Timbre("T1",false);
		luz l1 = new luz("luz 1", false);
		alarmaluminosa a1 = new alarmaluminosa(false,false,false,t1,l1);

		a1.comprobar();
	}

}
