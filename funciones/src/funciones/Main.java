package funciones;

public class Main {
	
	// Funcion precio total
	public static float precioTotal(float precioUd, int uds) {
		//Variables
		float precioT;
		
		System.out.println("------ Funcion de calculo de precio total de un producto -----");
		precioT=precioUd*uds;
		System.out.println("PRECIO TOTAL = "+precioT);
		
		return precioT;
		
	}

	public static void main(String[] args) {
		float precioProducto= 0f;
		
		//Calculo el precio total
		precioProducto=precioTotal(52.87f,4);
		System.out.println("PRECIO TOTAL = "+precioProducto);
	}

}
