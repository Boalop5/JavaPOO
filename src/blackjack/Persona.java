package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Persona {


private String nombre;
private List<Carta> mano;

public Persona(String nombre) {
    this.nombre = nombre;
    this.mano = new ArrayList<>();
}

public void agregarCarta(Carta carta) {
    mano.add(carta);
}

public void mostrarMano() {
    System.out.println(nombre + " tiene las siguientes cartas:");
    for (Carta carta : mano) {
        System.out.println("  " + carta);
    }
}

public int calcularValorMano() {
    int valorTotal = 0;
    int numAces = 0;

    for (Carta carta : mano) {
        int valorCarta = carta.getValor();

        if (valorCarta >= 11 && valorCarta <= 13) {
            valorTotal += 10; 
        } else if (valorCarta == 1) {
            numAces++;
            valorTotal += 11; 
        } else {
            valorTotal += valorCarta; 
        }
    }

    while (valorTotal > 21 && numAces > 0) {
        valorTotal -= 10;
        numAces--;
    }

    return valorTotal;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public List<Carta> getMano() {
	return mano;
}

public void setMano(List<Carta> mano) {
	this.mano = mano;
}
}                   
