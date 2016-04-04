
public class alarma {
	
	public boolean vidrio=false;
	public boolean puertaventana=false;
	public boolean movimiento=false;
	public Timbre timbre;

	public alarma(boolean vidrio, boolean puertaventana, boolean movimiento, Timbre timbre) {
		super();
		this.vidrio = vidrio;
		this.puertaventana = puertaventana;
		this.movimiento = movimiento;
		this.timbre = timbre;
	}

	public boolean comprobar(){
		
		if((vidrio)||(puertaventana)||(movimiento)){
			timbre.hacerSonar();
			return true;
			
		}else{
			return false;
		}
		
	}
}
