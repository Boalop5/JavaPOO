package blackjack;

public class Crupier extends Persona {
	
    public Crupier() {
        super("Crupier");
    }

    public boolean debePedirCarta() {
        int valorMano = calcularValorMano();
        return valorMano <= 17;
    }
 
    public void mostrarMano() {
       super.mostrarMano();
    } 
    public void resetMano() {
        getMano().clear();
    }

}
    
