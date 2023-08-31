package soyRunner;
import java.util.Scanner;

public class Main {
	
	//MENU DE TRABAJO PARA INTERACTUAR CON EL USUARIO
	public static int mostrarMenu(boolean error) {
		Scanner sc= new Scanner(System.in);
		if(error) System.out.println("INTRODUCE ÚNICAMENTE UNA VALOR [0,1,2,3]");
		System.out.println("---------MENU---------");
		System.out.println("[0] FINALIZAR");
		System.out.println("[1] NUEVO DATO");
		System.out.println("[2] MOSTRAR DATOS");
		System.out.println("[3] BORRAR ULTIMO DATO");
		System.out.println("----------------------");
		System.out.print("TU OPCION [0,1,2,3]-> ");
		int respuesta=sc.nextInt();
		while(respuesta<0||respuesta>3) respuesta=mostrarMenu(true);
		return respuesta;
	}
	
	//Solicitar un nuevo registro
	
	public static void nuevoRegistro(float tmpos[],float dst[],String tg[], int uReg) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Introduce el nuevo tiempo en min,seg: ");
		float nuevoDato=sc.nextFloat();
		tmpos[uReg]= nuevoDato;
		System.out.println("Introduce la distacia recorrida en Km: ");
		float datoDst=sc.nextFloat();
		dst[uReg]=datoDst;
		System.out.println("Introduce una nueva etiqueta: ");
		sc.nextLine();
		String datoTg=sc.nextLine();
		tg[uReg]=datoTg;
		
	}

	//Mostrar registros
	public static void mostrarRegistros(float tmpos[],float dst[],String tg[], int uReg) {
		System.out.println("---------DATOS--------");
		for(int i=0;i<uReg;i++) {
			System.out.println("Tiempo["+i+"]: "+tmpos[i]+" min"+" Distancia["+i+"]: "+dst[i]+" Km"+" Etiqueta["+i+"]: "+tg[i]);
		}
		System.out.println("----------------------");
	}
	
	//Borrar ultimo registro
	public static void delete(float tiempos[],float distancias[],String tag[],int uReg) {
		System.out.println("Se eliminara el ultimo registro añadido");
		Scanner sc=new Scanner(System.in);
		tiempos[uReg]=0.0f;
		distancias[uReg]=0.0f;
		tag[uReg]="";
	}
	
	
	public static void main(String[] args) {
		//Definir los arrays
		float tiempos[]= new float[10];
		float distancias[]= new float[10];
		String tag[]= new String[10];
		int ultRegistro=0;
		
		
		//Inicializacion de variables
		int respuesta= 1;
		
		respuesta=mostrarMenu(false);
		
		//Acciones sobre menu
		while(respuesta!=0) {
			switch (respuesta) {
			case 1:
				nuevoRegistro(tiempos,distancias,tag,ultRegistro);
				ultRegistro++;
				break;
			case 2:
				mostrarRegistros(tiempos,distancias,tag,ultRegistro);
				break;
			case 3:	
				delete(tiempos,distancias,tag,ultRegistro);
				ultRegistro--;
				break;
			}
		    respuesta=mostrarMenu(false);	
		}
	}
}


