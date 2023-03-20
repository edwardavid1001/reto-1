import java.util.Scanner;

public class reto5 {
  public static void main(String[] args) {
    Scanner guardarx = new Scanner(System.in);
    
    // Solicitar el nombre del empleado
    System.out.print("Nombre del empleado: ");
    String nombreEmpleado = guardarx.nextLine();
    
    // Solicitar el nombre del cliente
    System.out.print("Nombre del cliente: ");
    String nombreCliente = guardarx.nextLine();
    
    // Solicitar la cantidad de productos que quiere el cliente
    System.out.print("Cantidad de productos: ");
    int cantidadProductos = guardarx.nextInt();
    
    // Calcular el total de la compra
    double totalCompra = 0.0;
    for (int i = 1; i <= cantidadProductos; i++) {
      System.out.print("Precio del producto " + i + ": $");
      double precioProducto = guardarx.nextDouble();
      totalCompra += precioProducto;
    }
    
    // Imprimir el recibo de la compra
    System.out.println();
    System.out.println("Empleado: " + nombreEmpleado);
    System.out.println("Cliente: " + nombreCliente);
    System.out.println("Total de la compra: $" + totalCompra);

guardarx.close();
  }
}