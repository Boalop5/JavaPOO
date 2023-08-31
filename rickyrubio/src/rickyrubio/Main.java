package rickyrubio;

public class Main {

	public static void main(String[] args) {
		// Datos personales
		String name ="Ricky";
		String lastName ="Rubio";
		int age = 32;
		int height = 188;
		
		//Datos de equipo
		short dorsal = 13;
		String team = "Cavaliers";
		
		//Temporada 22/23
		float puntosPartido = 5.2f;
		float rebPartido = 2.1f;
		float asisPartido = 3.5f;
		boolean lesionado = false;
		
		//Datos en la consola
		
		System.out.println("----Datos personales----");
		System.out.println("Nombre: "+name);
		System.out.println("Apellido: "+lastName);
		System.out.println("Edad: "+age);
		System.out.println("Altura(cm): "+height);
		System.out.println();
		System.out.println("----Datos Equipo----");
		System.out.println("Dorsal: "+dorsal);
		System.out.println("Equipo: "+team);
		System.out.println();
		System.out.println("-----22-23-----");
		System.out.println("PPP: "+puntosPartido);
		System.out.println("RPP: "+rebPartido);
		System.out.println("APP: "+asisPartido);
		System.out.println("¿Lesionado? "+lesionado);
	}   
	    
}
