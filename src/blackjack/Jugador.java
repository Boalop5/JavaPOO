package blackjack;

public class Jugador extends Persona {
    
    private int apuesta;
    private int fichas;

    public Jugador(String nombre, int dineroInicial) {
        super(nombre);
        
        this.fichas = dineroInicial;
    }


    public void apostar(int apuesta) {
        this.apuesta = apuesta;
        restarFichas(apuesta);
    }

    public void resetApuesta() {
        this.apuesta = 0;
    }

    public int getApuesta() {
        return apuesta;
    }

    public void setApuesta(int apuesta) {
        this.apuesta = apuesta;
    }

    public int getFichas() {
        return fichas;
    }

    public void restarFichas(int cantidad) {
        fichas -= cantidad;
    }

    public void sumarFichas(int cantidad) {
        fichas += cantidad;
    }
    public void resetMano() {
        getMano().clear(); 
    }
    public boolean tieneSuficientesFichas(int cantidad) {
        return fichas >= cantidad;
    }
    

    public void resultadoApuesta(boolean ganador) {
        if (ganador) {
            sumarFichas(getApuesta() * 2); 
        }
        resetApuesta();
    }
    public void mostrarFichas() {
        System.out.println("Fichas de " + getNombre() + ": " + fichas);
    }
   
   
    public void mostrarMano() {
        super.mostrarMano();
     } 

    @Override
    public int calcularValorMano() {
        return super.calcularValorMano();
    }
}