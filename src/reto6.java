import java.util.Random;
import java.util.Scanner;

public class reto6 {
    public static void main(String[] args) {
        Scanner guardarx = new Scanner(System.in);
        Random random = new Random();
        int vidas = 3;
        int dinero = 100;
        int apuesta;
        int caraOSello;
        int resultado;

        System.out.println("Bienvenido al juego de Cara o Sello.");
        System.out.println("Tienes " + vidas + " vidas y $" + dinero + " para apostar.");

        while (vidas > 0 && dinero > 0) {
            System.out.println("¿Cuánto quieres apostar? $");
            apuesta = guardarx.nextInt();
            while (apuesta > dinero) {
                System.out.print("No tienes suficiente dinero. Apuesta menos: $");
                apuesta = guardarx.nextInt();
            }
            System.out.print("¿Cara (1) o Sello (2)? ");
            caraOSello = guardarx.nextInt();
            while (caraOSello != 1 && caraOSello != 2) {
                System.out.print("Ingresa 1 para Cara o 2 para Sello: ");
                caraOSello = guardarx.nextInt();
            }

            resultado = random.nextInt(2) + 1;

            System.out.println("El resultado es: " + (resultado == 1 ? "Cara" : "Sello"));

            if (caraOSello == resultado) {
                dinero += apuesta;
                System.out.println("¡Ganaste $" + apuesta + "!");
            } else {
                vidas--;
                dinero -= apuesta;
                System.out.println("Perdiste $" + apuesta + ".");
                if (vidas == 0) {
                    System.out.println("Se te acabaron las vidas. ¡Fin del juego!");
                } else {
                    System.out.println("Te quedan " + vidas + " vidas.");
                }
            }
        }
        System.out.println("Gracias por jugar.");
        guardarx.close();
    }
}





