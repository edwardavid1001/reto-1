import java.util.random.*;
import java.util.Scanner;
public class reto3{
 public static void main(String[] args) {
    String moneda;
     int aleatorio ;
     Scanner guardar= new Scanner(System.in);
     System.out.println("preparese que el juego va empezar");
     System.out.println("digite cara o cruz");
     moneda = guardar.next();
 switch (moneda) {
     case "cara":
     int cara =1;
        aleatorio = (int) (Math.random () *100);
         if (aleatorio < 50){
             System. out.println("CARAUSTED PIERDE ");
         }else if (aleatorio > 50) {
             System. out.println("CRUZ USTED GANA");
         }
         break;
         case "cruz":
         int cruz =100;

        aleatorio = (int) (Math.random () *100);
         if (aleatorio < 50) {
             System.out.println("CRUZ USTED PIERDE ");
         }
         else if (aleatorio > 50){
             System. out.println("CARA USTED GANA");
        }
        break;
        }
        guardar.close();

         }

        }





