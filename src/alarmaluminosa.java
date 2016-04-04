
public class alarmaluminosa extends alarma{
	
	public luz luzalarma;

	public alarmaluminosa(boolean vidrio, boolean puertaventana, boolean movimiento, Timbre timbre, luz luzalarma) {
		super(vidrio, puertaventana, movimiento, timbre);
		this.luzalarma = luzalarma;
	}

	public boolean comprobar(){
		
		if((vidrio)||(puertaventana)||(movimiento)){
			timbre.hacerSonar();
			luzalarma.encender();
			return true;
			
		}else{
			return false;
		}
		
	}
	
	

}
