package blackjack;

public class Carta {

private int valor;
private String palo;


public Carta(int valor, String palo) {
	this.valor = valor;	
	this.palo = palo;
		
	}

public int getValor() {
	return valor;
}

public void setValor( int valor) {
	this.valor = valor;
}

public String getPalo() {
	return palo;
}

public void setPalo(String palo) {
	this.palo = palo;
}


@Override
public String toString() {
    String valorCartaStr;
    if (valor == 1) {
        valorCartaStr = "A";
    } else if (valor == 11) {
        valorCartaStr = "J";
    } else if (valor == 12) {
        valorCartaStr = "Q";
    } else if (valor == 13) {
        valorCartaStr = "K";
    } else {
        valorCartaStr = String.valueOf(valor);
    }

    return valorCartaStr + " de " + palo;
}

}
