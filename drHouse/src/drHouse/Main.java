package drHouse;
import java.util.Scanner;

public class Main {
	
	public static String pregunta(String p) {
		//Activo Scanner
		Scanner sc = new Scanner(System.in);
		//Pregunto
		System.out.println(p);
		//Responde el usuario
		String r=sc.nextLine();
		//Devuelvo la respuesta
		return r;
	}
	
	//Radiografia
	public static void departrayosx(String name) {
		
		System.out.println("Aqui tiene sus rayos x, debe dirigirse de nuevo a traumatologia");
		System.out.println();
		
	}
	
	//Funcion traumatologia
	public static void departTrauma(String name) {
		//Realizar proceso de preguntas trauma
		System.out.println("Usted "+name+" debe dirigirse a hacer una radiografia");
		System.out.println();
		departrayosx(name);
		
		System.out.println("Segun la radiografia, usted tiene una leve contusion en el craneo ");
	}
	
	//Funcion respiratoria
	
	public static void departRespiratorio(String name) {
		System.out.println("Usare el estetoscopio");
		System.out.println();
		
		System.out.println("Parece una bronquitis, debe tomar los remedios recetados, opcionalmente puede tomar te de jengibre u otro brebaje");
		
	}
	
	//Funcion cardiologa
	public static void departCardiologia(String name) {
		System.out.println("Ok, ya que ha sufrido estres y nauseas, usare un tensiometro, respire profundamente");
		System.out.println();
		System.out.println("Si, su presion arterial es mayor de la esperada, le recetare benazepril");
		System.out.println();
		System.out.println("Tambien debe alimentarse mejor, evitar fumar o ingerir alcohol por un mes inclusive");
	}
	
	//Funcion principal
	public static void triage(String name) {
		String respuesta="";
		
		//Preguntamos si se ha caído
		respuesta=pregunta(name+" ¿Has sufrido una caída?[S,N]");
		while(!respuesta.equals("S")&&!respuesta.equals("N")) {
			respuesta=pregunta(name+" ¿Has sufrido una caída?[S,N]");
		}
		if(respuesta.equals("S")) {
			//Traumatologia y rayos x
			System.out.println("A radiologia");
			departTrauma(name);
		}else if(respuesta.equals("N")){
			//Preguntamos si tiene fiebre
			respuesta=pregunta(name+" ¿Has tenido fiebre?[S,N]");
			while(!respuesta.equals("S")&&!respuesta.equals("N")) {
				respuesta=pregunta(name+" ¿Has tenido fiebre?[S,N]");
				}if(respuesta.equals("S")) {
					System.out.println("A respiratorio");
					departRespiratorio(name);
				}else if (respuesta.equals("N")) {
					//Preguntamos sobre su corazon
					respuesta=pregunta(name+" ¿Has tenido estres o nauseas?[S,N]");
					while(!respuesta.equals("S")&&!respuesta.equals("N")) {
						respuesta=pregunta(name+" ¿Has tenido estres o nauseas?[S,N]");
					}if(respuesta.equals("S")) {
					  System.out.println("A cardiologia");
					  departCardiologia(name);
					}else if(respuesta.equals("N")) {
						System.out.println("Usted no padece nada, solo me vacila");
						System.exit(0);
					}
				}
			}
		}
		
public static void main(String[] args) {

		//Comienza el proceso
		triage("Boa");

	}

}
