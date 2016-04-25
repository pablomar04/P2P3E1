import java.util.Vector;


public class Telefono {
	
	int numero;
	
	
	
	public Telefono(int numero) {
		super();
		this.numero = numero;
	}



	public boolean numeroSeguro(Vector <sensor> sensores){
		boolean aux=true;
		for (int i=0;i<sensores.size();i++){
			
			if(sensores.elementAt(i).estado==true){
				aux=false;
				break;
				}
			}
		return aux;
		
	}

}
