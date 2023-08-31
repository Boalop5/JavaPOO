package blackjack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Mazo {
private List<Carta> cartas;
	public Mazo() {
		cartas = new ArrayList<>();
        String palos[] = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        for (String palo : palos) {
            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(valor, palo));
            }
        }
        Collections.shuffle(cartas);
    }
	public Carta sacarCarta() {
        if (cartas.isEmpty()) {
            return null; 
        }
        return cartas.remove(0);
    }
}

