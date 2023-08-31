package macarronesReceta;

public class Receta {

	public static void main(String[] args) {
		String recipe ="Macarrones con tomate casero";
		short time = 50;
		String ingredient = "Macarrones";
		int weigth = 400;
		String item = "Tomate triturado";
		int weigthTwo = 800; 
		String itemTwo = "Cebolla";
		
        
		
		System.out.println("----Receta----");
		System.out.println(recipe);
		System.out.println("Duracion: "+time+" minutos");
		System.out.println();
		System.out.println("---Ingredientes---");
		System.out.println(weigth+" gramos de "+ingredient);
		System.out.println(weigthTwo+" gramos de "+item);
		System.out.println("Una "+itemTwo);
	
		
	}

}
