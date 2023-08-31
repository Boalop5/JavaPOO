package cartLuminoso;

public class Main {

	public static void main(String[] args) {
		int width = 5;
		int height= 7; 
		
		//Primera Letra L
		//
		//*
		//*
		//*
		//*
		//*
		//*
		//*****
		
		for(int fila=1;fila<=height;fila++) {
			//Bucle anidado
			for(int columna=1;columna<=width;columna++) {
				if((columna==1)&&(fila!=7)) {
					System.out.print("*");
				}else if(fila==7) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	        // LETRA E
			//
			// *****
			// *
			// *
			// ****
			// *
			// *
			// *****	
		
		for(int fila=1;fila<=height;fila++) {
			for(int columna=1;columna<=width;columna++) {
				if((fila==1)) {
					System.out.print("*");
				}else if((fila==(height/2)+1)&&(columna<width)) {
					System.out.print("*");
				}else if(columna==1) {
					System.out.print("*");
				}else if(fila==height) {
					System.out.print("*");
				}
			}
			System.out.println();
			
			
		}
		System.out.println();
		
			}
				
		
	}
  
  


