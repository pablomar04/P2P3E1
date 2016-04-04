
public class alarmaluminosa extends alarma{
	
	luz luzalarma;

	public alarmaluminosa(boolean vidrio, boolean puertaventana, boolean movimiento, Timbre timbre, luz luzalarma) {
		super(vidrio, puertaventana, movimiento, timbre);
		this.luzalarma = luzalarma;
	}

	
	
	

}
