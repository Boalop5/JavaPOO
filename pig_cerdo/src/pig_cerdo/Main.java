package pig_cerdo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int WINNING_SCORE = 100;

    public static int rollDice() {
        return new Random().nextInt(6) + 1;
    }

    public static void player_turn(Scanner sc, List<Integer> scores, int currentPlayer, String player_name) {
        int turnScore = 0;
        int rolls = 0;
        int diceValue;

        System.out.println("\n------ Turno de: " + player_name + " ------");
        int choice;
        do {
            System.out.println("1. Tirar el dado");
            System.out.println("2. Ver puntuacion total");
            System.out.println("3. Ver puntuacion del turno");
            System.out.println("4. Pasar y terminar el turno");
            System.out.println();
            System.out.println("Elija su opcion: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (rolls >= 3) {
                        System.out.println("Ya has tirado 3 veces en este turno, turno de la IA");
                        System.out.println();
                        currentPlayer = 3 - currentPlayer;
                        rolls = 0;
                        turnScore = 0;
                        break;
                    }

                    diceValue = rollDice();
                    if (diceValue == 1) {
                        System.out.println("Has sacado un 1, pierdes los puntos y el turno");
                        System.out.println();
                        turnScore = 0;
                        currentPlayer = 3 - currentPlayer;
                        rolls = 0;
                    } else {
                        System.out.println("Has sacado un: " + diceValue);
                        System.out.println();
                        turnScore += diceValue;
                        rolls++;
                    }
                    break;

                case 2:
                    System.out.println("Puntuacion total de " + player_name + ": " + (scores.get(currentPlayer - 1) + turnScore));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Tu puntuacion actual es: " + turnScore);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Has decidido pasar y terminar el turno.");
                    currentPlayer = 3 - currentPlayer;
                    rolls = 0;
                    scores.set(currentPlayer - 1, scores.get(currentPlayer - 1) + turnScore);
                    turnScore = 0;
                    break;

                default:
                    System.out.println("Opcion invalida, ingrese alguna de las opciones disponibles");
                    break;
            }
        } while (choice != 4 && (rolls < 3 || currentPlayer == 2));

        // Acumulacion de puntos 
        scores.set(currentPlayer - 1, scores.get(currentPlayer - 1) + turnScore);
    }

    public static void aiTurn(List<Integer> scores, int currentPlayer) {
        int turnScore = 0;
        int rolls = 0;
        boolean passed = false;

        System.out.println("------Turno de la IA-----");
        System.out.println();
        while (rolls < 3 && !passed) {
            int diceValue = rollDice();
            if (diceValue == 1) {
                System.out.println("La IA ha sacado 1, pierde los puntos, es tu turno");
                System.out.println();
                turnScore = 0;
                break;
            } else {
                System.out.println("La IA ha sacado: " + diceValue);
                System.out.println();
                turnScore += diceValue;
                if ((scores.get(currentPlayer - 1) - turnScore) > scores.get(0) || turnScore >= 15) {
                    System.out.println("La IA ha decidido pasar este turno");
                    System.out.println();
                    scores.set(currentPlayer - 1, scores.get(currentPlayer - 1) + turnScore);
                    passed = true;
                }
            }
            rolls++;
        }

        // Acumulacion de puntos 
        scores.set(currentPlayer - 1, scores.get(currentPlayer - 1) + turnScore);

        // Puntuación acumulada de la IA en el turno
        System.out.println("Puntuacion de la IA en este turno: " + turnScore);
        System.out.println();
        // Puntuación total
        System.out.println("Puntuacion total de la IA: " + scores.get(1));
    }
    
    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        scores.add(0); // Puntuación del jugador
        scores.add(0); // Puntuación de la IA
        int currentPlayer = 1;
        String player_name;

        System.out.println("---Bienvenido, este es el juego de Pig el Cerdo-----");
        System.out.println();
        System.out.println("El jugador y la computadora tienen que lanzar el dado 3 veces durante cada turno");
        System.out.println();
        System.out.println("El primero que llegue a 100 puntos gana.");
        System.out.println();
        System.out.println("Ingrese su nombre: ");
        player_name = sc.nextLine();
        
        clearConsole();
        //Main loop
        while (scores.get(0) < WINNING_SCORE && scores.get(1) < WINNING_SCORE) {
            if (currentPlayer == 1) {
                player_turn(sc, scores, currentPlayer, player_name); // Turno del jugador
                clearConsole();
            } else {
                aiTurn(scores, currentPlayer); // Turno de la IA
                
            }
            currentPlayer = 3 - currentPlayer; // Cambio de jugador
        }

        System.out.println("\n------ Resultado Final ------");
        System.out.println("Puntuacion total de " + player_name + ": " + scores.get(0));
        System.out.println("Puntuacion total de la IA: " + scores.get(1));

        if (scores.get(0) >= WINNING_SCORE) {
            System.out.println("¡Felicidades! Has ganado");
        } else {
            System.out.println("La IA ha ganado,intentalo de nuevo");
        }

        sc.close();
    }
}