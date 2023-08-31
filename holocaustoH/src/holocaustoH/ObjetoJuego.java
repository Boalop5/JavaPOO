package holocaustoH;

public class ObjetoJuego {
	//Tipos de ObjetosJuego
	final static int PLAYER=0;
	final static int HADRON=1;
	final static int PIEZA=2;
	final static int OBJETO=3;
	final static int PUERTA_IN=4;
	final static int PUERTA_OUT=5;	
	
	//propiedades
	private String nombre;
	private Posicion pos;
	private int tipoObjeto=-1;

	//letra en mapa
	private char letraMapa=' ';


	public ObjetoJuego() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Posicion getPos() {
		return pos;
	}

	public void setPos(Posicion pos) {
		this.pos = pos;
	}

	public char getLetraMapa() {
		return letraMapa;
	}

	public void setLetraMapa(char letraMapa) {
		this.letraMapa = letraMapa;
	}

	public int getTipoObjeto() {
		return tipoObjeto;
	}

	public void setTipoObjeto(int tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}

}
