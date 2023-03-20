import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class reto8 {
    public static void main(String[] args) {
        Scanner guardarx = new Scanner(System.in);

        Integer auxilioUsuario;
        String nombreUsuario;
        String respuesta;
        Map<String, Integer> usuariosauxilios = new HashMap<>();

        while (true) {
            System.out.println("¿Desea registrar un nuevo usuario? (S/N)");
            respuesta = guardarx.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("gracias por usa sistema :)");

                break;
            }

            System.out.println("Ingrese el nombre del usuario:");
             nombreUsuario = guardarx.nextLine();

            if (usuariosauxilios.containsKey(nombreUsuario)) {
                System.out.println("Este usuario ya ha elegido el auxilio  " + usuariosauxilios.get(nombreUsuario));
                continue;
            }

            System.out.println("Ingrese 1 para auxilio de trasporte / 2 para auxilio de salud / 3 para auxilio de vivienda :");
            auxilioUsuario = guardarx.nextInt();
            guardarx.nextLine();

            usuariosauxilios.put(nombreUsuario, auxilioUsuario);

            System.out.println("Usuario registrado correctamente");
        }
        guardarx.close();

    }
}


