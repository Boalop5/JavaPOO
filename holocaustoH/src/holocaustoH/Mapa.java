package holocaustoH;



public class Mapa {
	private Habitacion[] habitaciones;
	private int habitacionActual;
	
	public Mapa(int numHabitaciones) {
		habitaciones = new Habitacion[numHabitaciones];
		for(int i=0;i<numHabitaciones;i++) {
			habitaciones[i]=new Habitacion();
		}
		
	}

}
