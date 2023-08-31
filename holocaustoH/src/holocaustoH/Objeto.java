package holocaustoH;

/*
 * Objeto que se puede almacenar dentro una habitacion
 * 
 * @author Boanerge
 * @author Mastermind
 * @version 1.0
 * @see holocaustoH.ObjetoJuego
 * 
 */
 
public class Objeto extends ObjetoJuego {
	//Propiedad
	private int peso=0;
	
	/*
	 *Objeto es el constructor de la clase 
	 * 
	 **/

	public Objeto() {
		
	}
    
	/*
	 * getPeso devuelve el peso del objeto 
	 *
	 * @return int peso del objeto 
	 * 
	 **/

	public int getPeso() {
		return peso;
	}
	
	/*
	 * setPeso asigna el peso del objeto 
	 *
	 * @param int peso del objeto 
	 * 
	 **/
	
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
