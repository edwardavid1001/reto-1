import java.util.Scanner;
 
public class reto4{
    public static void main(String args[])
    {

        int seleccionCompu;
        int seleccionUsuario;
        Scanner guardarx = new Scanner(System.in);

        
        System.out.println("Juego piedra-papel-tijera");
 
        seleccionCompu = (int)(Math.random() * 3) + 1;
        System.out.println("La maquina esta Elijiendo");
 
        System.out.print("1Piedra,/ 2Papel,/ 3Tijera : ");
        seleccionUsuario = guardarx.nextInt();
 

        switch ( seleccionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Empate"); break;//posibles resultados
                   case 2: System.out.println("Usted gana"); break;  //posibles resultados
                   case 3: System.out.println("La maquina gana"); break;//posibles resultados
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("La maquina gana"); break;//posibles resultados
                   case 2: System.out.println("Empate"); break;//posibles resultados
                   case 3: System.out.println("Usted gana"); break;//posibles resultados
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( seleccionUsuario )
                {
                   case 1: System.out.println("Usted gana"); break;//posibles resultados
                   case 2: System.out.println("La maquina gana"); break;//posibles resultados
                   case 3: System.out.println("Empate"); break;//posibles resultados
                }
                break;
        }
        guardarx.close();
 }
}