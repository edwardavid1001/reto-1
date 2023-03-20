import java.util.Scanner;
import java.util.Random;

public class reto7{

    public static void main(String[] args) {
        Scanner guardarx = new Scanner(System.in);
        Random random = new Random();

        int vidas = 3;
        int apuesta = 0;
        int jugadorPuntaje = 0;
        int computadoraPuntaje = 0;

        System.out.println("¡Bienvenido al juego Piedra, Papel o Tijeras!");
        System.out.println("Cada jugador comienza con 3 vidas.");

        while (vidas > 0) {
            System.out.println("Tienes " + vidas + " vidas restantes.");
            System.out.println("¿Cuánto quieres apostar?");

            while (apuesta <= 0 || apuesta > vidas) {
                apuesta = guardarx.nextInt();

                if (apuesta <= 0 || apuesta > vidas) {
                    System.out.println("Ingresa una apuesta válida.");
                }
            }

            System.out.println("Elige tu jugada: 1 - Piedra, 2 - Papel, 3 - Tijeras");
            int jugadorJugada = guardarx.nextInt();
            int computadoraJugada = random.nextInt(3) + 1;

            System.out.println("La computadora eligió " + convertirJugada(computadoraJugada));

            int resultado = obtenerResultado(jugadorJugada, computadoraJugada);

            if (resultado == 0) {
                System.out.println("Empate.");
            } else if (resultado == 1) {
                System.out.println("¡Ganaste!");
                jugadorPuntaje++;
                vidas++;
            } else {
                System.out.println("¡Perdiste!");
                computadoraPuntaje++;
                vidas--;
            }

            System.out.println("Tu puntaje: " + jugadorPuntaje);
            System.out.println("Puntaje de la computadora: " + computadoraPuntaje);
            apuesta = 0;
        }

        if (jugadorPuntaje > computadoraPuntaje) {
            System.out.println("¡Felicidades, ganaste el juego!");
        } else {
            System.out.println("¡Lo siento, perdiste el juego!");
        }
    }

    public static String convertirJugada(int jugada) {
        if (jugada == 1) {
            return "Piedra";
        } else if (jugada == 2) {
            return "Papel";
        } else {
            return "Tijeras";
        }
    }

    public static int obtenerResultado(int jugadorJugada, int computadoraJugada) {
        if (jugadorJugada == computadoraJugada) {
            return 0;
        } else if ((jugadorJugada == 1 && computadoraJugada == 3) || (jugadorJugada == 2 && computadoraJugada == 1) || (jugadorJugada == 3 && computadoraJugada == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
}

