package poryectoMartha;
/**
 * Importar la libreria Scanner
 */
import java.util.Scanner;
/**
 * Creacion de la clase AssigmenttoParameter
 * @author Joselyn
 *
 */
public class AssigmenttoParameter {
	/**
	 * 
	 * @param args array 
	 */
	public static void main(String[] args) {
		// Inicicalizacion de la clase Scanner
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("Cantidad de productos :");
	    int cantidad = sc.nextInt();
	 
	    System.out.print("Precio (producto): ");
	    int precioUnitario=sc.nextInt();
	 
	    int importe = cantidad * precioUnitario; //importe SIN descuento
	 // llamada del metodo estatico descuento
	    discount(importe, cantidad);
	}
	/**
	 * 
	 * @param importe en entero
	 * @param cantidad en entero
	 */
	 public static void discount(int importe, int cantidad ) {
		 int newPay=importe;
	    //Ahora veremos si se aplica algún descuento
	    if (cantidad >= 2 && cantidad <= 5) {
	        System.out.println("\nDescuento aplicable: 10%");
	        System.out.println("Importe con descuento: " + (newPay * 0.9));
	    }
	    else if (cantidad >= 6 && cantidad <= 10) {
	        System.out.println("\nDescuento aplicable: 15%");
	        System.out.println("Importe con descuento: " + (newPay * 0.85));
	    }
	    else if (cantidad >= 11 && cantidad <= 20) {
	        System.out.println("\nDescuento aplicable: 20%");
	        System.out.println("Importe con descuento: " + (newPay * 0.8));
	    }
	    else if (cantidad > 20) {
	        System.out.println("\nDescuento aplicable: 45%");
	        System.out.println("Importe con descuento: " + (newPay * 0.55));
	    }
	    System.out.println("\nCantidad de productos: " + cantidad);
	    System.out.println("Importe base: " + importe);
	 
	}}