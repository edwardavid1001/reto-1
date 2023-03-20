import java.util.Scanner;


public class Reto2 {
  public static void main(String[] args) {
   String Namedoctor;
   String Namemom;
   String Namebaby;
   double Dosisvacuna; 
   double Pesobebe ;
   double Semanasbebe ;
   double Operacion ;
   double Mesesbebe ;
   double Operacion2 ;
   double Operacion3 ;
   
   Scanner guardar =new Scanner(System.in);
   System.out.print("digite el nombre del doctor :");
   Namedoctor=guardar.next();

   System.out.print("digite el nombre de la mama  :");
   Namemom=guardar.next();

   System.out.print("digite el nombre del bebe :");
   Namebaby=guardar.next();

   System.out.print("digite el peso de bebe :");
   Pesobebe=guardar.nextInt();

   System.out.print("digite las semans que tiene el bebe:");
   Semanasbebe=guardar.nextDouble();

Mesesbebe=Semanasbebe / 4;
Operacion2=Mesesbebe *10;
Operacion3= Pesobebe  +15;
Operacion=Pesobebe/Mesesbebe;
Dosisvacuna=Operacion*8;

   System.out.println("la dosis de vacuna es :"+Dosisvacuna +"mg ");
   System.out.print("los meses que tiene el bebe son :"+Mesesbebe);
guardar.close();
 }
}
