package blackjack;

import java.util.Scanner;

public class Juego {
    private Mazo mazo;
    private Jugador jugador;
    private Crupier crupier;
    private Scanner scanner;

    public Juego() {
        mazo = new Mazo();
        scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Blackjack!");
        System.out.print("Ingresa el nombre del jugador: ");
        String nombreJugador = scanner.nextLine();
        jugador = new Jugador(nombreJugador, 100); 
        crupier = new Crupier();
    }

    public void jugar() {
        boolean jugar = true;
        while (jugar) {
        	  if (jugador.getFichas() <= 0) {
                  System.out.println("¡Te has quedado sin fichas! El juego ha terminado.");
                  jugar = false;
                  break;
              }
            mostrarMenuApostar();
            int opcionApostar = scanner.nextInt();
            switch (opcionApostar) {
                case 1:
                    realizarApuesta();
                    jugador.mostrarFichas();
                    jugador.resetMano();
                    crupier.resetMano();
                    jugarMano();
                    break;
                case 2:
                    jugar = false;
                    break;
                default:
                    System.out.println("Opción invalida, por favor introduce un numero valido(1-2)");
            }
        }
        scanner.close();
    }

    private void jugarMano() {
        jugador.agregarCarta(mazo.sacarCarta());
        crupier.agregarCarta(mazo.sacarCarta());
        jugador.agregarCarta(mazo.sacarCarta());
        crupier.agregarCarta(mazo.sacarCarta());

        System.out.println("\nCartas repartidas:");
        jugador.mostrarMano();
        crupier.mostrarMano();

        while (true) {
            mostrarMenuMano();
            int opcionJugar = scanner.nextInt();
            switch (opcionJugar) {
                case 1:
                    pedirCarta(jugador);
                    if (jugador.calcularValorMano() > 21) {
                        mostrarResultado();
                        jugador.mostrarFichas();
                        jugador.resetMano();
                        crupier.resetMano();
                        return;
                    }
                    break;
                case 2:
                    plantarse(jugador);
                    jugarManoCrupier();
                    jugador.mostrarFichas();
                    return;
                case 3:
                    jugarManoCrupier();
                    jugador.mostrarFichas();
                    return;
                default:
                    System.out.println("Opción invalida, por favor introduce un numero valido(1-2-3)");
                    
            }
        }
    }

    private void mostrarMenuMano() {
        System.out.println("\nMenú de Juego:");
        System.out.println("1. Pedir una carta");
        System.out.println("2. Plantarse");
        System.out.println("3. Terminar turno");
        System.out.print("Elige una opción: ");
    }

    private void mostrarMenuApostar() {
        System.out.println("\nMenú de Apuestas:");
        System.out.println("1. Hacer una apuesta");
        System.out.println("2. Finalizar el juego");
        System.out.print("Elige una opción: ");
    }
    
    private void realizarApuesta() {
        System.out.print("Ingresa la cantidad de fichas para apostar (comienzas con 100 fichas): ");
        int apuesta = scanner.nextInt();
        if (jugador.tieneSuficientesFichas(apuesta)) {
            jugador.apostar(apuesta);
            System.out.println("Apuesta realizada: " + apuesta + " fichas.");
        } else {
            System.out.println("No tienes suficientes fichas para esa apuesta.");
        }
    }

    

    private void pedirCarta(Persona p) {
        Carta carta = mazo.sacarCarta();
        p.agregarCarta(carta);
        System.out.println(p.getNombre() + " ha recibido la carta: " + carta);
        mostrarValorMano(p);
    }

    private void plantarse(Persona p) {
        System.out.println(p.getNombre() + " se planta.");
        mostrarValorMano(p);
    }

    private void jugarManoCrupier() {
        while (crupier.debePedirCarta()) {
            pedirCarta(crupier);
        }

        System.out.println("\nCartas del crupier:");
        crupier.mostrarMano(); 

        mostrarResultado();
        
    }

    private void mostrarValorMano(Persona p) {
        int valor = p.calcularValorMano();
        System.out.println("Valor total de la mano de " + p.getNombre() + ": " + valor);
    }

    private void mostrarResultado() {
        int puntajeJugador = jugador.calcularValorMano();
        int puntajeCrupier = crupier.calcularValorMano();

        System.out.println("\nPuntaje del jugador: " + puntajeJugador);
        System.out.println("Puntaje del crupier: " + puntajeCrupier);

        if (puntajeJugador > 21) {
            System.out.println("Has perdido la mano.");
        } else if (puntajeCrupier > 21 || puntajeJugador > puntajeCrupier) {
            System.out.println("¡Has ganado la mano!");
            jugador.resultadoApuesta(true);
        } else if (puntajeJugador == puntajeCrupier) {
            System.out.println("Es un empate. Recuperas tu apuesta.");
            jugador.resultadoApuesta(false);
        } else {
            System.out.println("Has perdido la mano.");
        }
    }
}