package holocaustoH;
import java.util.ArrayList;

public class Mochila {
	private int capacidadMaxima;
	private ArrayList<ObjetoJuego> objetos;

	public Mochila(int capacidadMaxima) {
		this.capacidadMaxima= capacidadMaxima;
		objetos= new ArrayList<>();//lista de objetos
	}
	
	
	public boolean agregarObjeto(ObjetoJuego obj) {
		if(objetos.size()<capacidadMaxima) {
			objetos.add(obj);
			return true;
		}
		return false;
	}
    
	public void usarObjeto(int index) {
		if(index>=0 && index < objetos.size()) {
		     ObjetoJuego obj= objetos.get(index);
		     
		   
		}else objetos.remove(index);
	}
}
