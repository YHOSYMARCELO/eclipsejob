package poryectoMartha;

import java.util.Scanner;

/**
 * crear Clase 
 * @author Joselyn
 *
 */
public class MetConstante {
	/**
	 * 
	 * @param arg metodo principal
	 */
	public static void main(String[] arg) {
		
		//Declaracion e inicicializacion de la clase Scanner 
		Scanner ent = new Scanner(System.in);
		int opcion=0;
		
		System.out.println("Seleccione que desea calcular: ");
		System.out.println("1.Altura"
				+ "\n2.Velocidad final"
				+ "\n3.Tiempo");
		opcion=ent.nextInt();
		
		switch(opcion) {
		case 1: calcularAltura(opcion);
			break;
		case 2: calcularVFinal(opcion);
			break;
		case 3: calcularTiempo(opcion);
			break;
		}
		
	}
	/**
	 * 
	 * @param opcion en valor entero
	 */
	public static void calcularAltura(int opcion) {
		
		Scanner ent = new Scanner(System.in);
		float tiempo=0.0f, altura=0.0f;
		
		System.out.println("Introduce el tiempo en segundos");
		tiempo=ent.nextFloat();
		
		altura=(float) (Math.pow(tiempo, 2)*gravedad())/2;
		
		System.out.println("La altura es " + altura + " metros");
		
	}
	/**
	 * 
	 * @param opcion en valor entero
	 */
	public static void calcularVFinal(int opcion) {
		
		Scanner ent = new Scanner(System.in);
		float tiempo=0.0f, VFinal=0.0f;
		System.out.println("Introduce el tiempo en segundos");
		tiempo=ent.nextFloat();
		
		VFinal=(float) (gravedad()*tiempo);
		
		System.out.println("La velocidad final es " + VFinal + "m/s");
		
	}
	/**
	 * 
	 * @param opcion valor entero
	 */
	public static void calcularTiempo(int opcion) {
		
		Scanner ent = new Scanner(System.in);
		float VFinal=0.0f, tiempo=0.0f;
		System.out.println("Introduce el tiempo en segundos");
		VFinal=ent.nextFloat();
		
		tiempo=(float) (VFinal/gravedad());
		
		System.out.println("El tiempo es " + tiempo + "segundos");
		
	}
	
	public static double gravedad() {
		return 9.81;
	}

}

