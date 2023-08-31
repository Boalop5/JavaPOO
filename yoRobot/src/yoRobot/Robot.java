package yoRobot;

public class Robot {
	//propiedades
	private double peso;
	
	//Piezas del Robot
	Pieza sinIdentificar;
	CPU cpu;
	Bateria bateria;
	
	
	public Robot() {
		this.cpu=new CPU();
		this.cpu.setNumSerie("rx5500ART");
		this.cpu.setPeso(0.5f);
		this.bateria=new Bateria();
		this.bateria.setPeso(250f);

		
		
	}
	
	
	//GETTER & SETTER
	public void setPeso(double p) {
		if(p<0) this.peso=0;
		else this.peso=p;
}
	public double getPeso() {
		return this.peso;
	}
     
	
}
