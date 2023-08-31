package cartLuminoso;

public class Letras {

	public static void main(String[] args) {
		int width= 5;
		int height= 7;
		//LETRA F
		//
		//*****
		//*
		//*
		//****
		//*
		//*
		//*
		for(int fila=1;fila<=height;fila++) {
			for(int columna=1;columna<=width;columna++) {
				if((fila==1)) {
				  System.out.print("*");
				}else if((fila==(height/2)+1)&&(columna<width)) {
							System.out.print("*");
				}else if(columna==1) {
					        System.out.print("*");
				}
			}
						
				System.out.println();

						
			}
		System.out.println();
		//Letra T
		//
		//*****
		//  *
		//  *
		//  *
		//  *
		//  *
		//  *
		for(int fila=1;fila<=height;fila++) {
			for(int columna=1;columna<=width;columna++) {
				if((fila==1)) {
					System.out.print("* ");
			    }else if(columna!=3) {
			    	System.out.print("  ");
			    }else if(columna==3) {
			    	System.out.println("*");
			    }
		}
			System.out.println();
		}
	}

}


