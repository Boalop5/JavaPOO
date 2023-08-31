package yoRobot;

public class Main {

	public static void main(String[] args) {
		int edad= 40;
		
		Robot r= new Robot();
		Robot boa= new Robot();
	   
		
		//Objetos
		r.setPeso(120.67);
		boa.setPeso(-198.6);
	
		
		System.out.println(r.getPeso());
		System.out.println(boa.getPeso());
		

    }
}
