package poryectoMartha;

import java.util.Scanner;
/**
 * Clase Principal del Sistema
 * @author Pedro
 *
 */
public interface Main {
	
	/**
	 * 
	 * @param args principal
	 */
	public static void main(String args[]) 
	
	{
		Scanner sc= new Scanner (System.in); 
		String [] row= new String [2]; // Declaramos e instanciamos un array
		row[0]="LiverPool"; 
		row[1]="15"; 
		
		ArraytoObject a1[][]= new ArraytoObject[2][2]; 
	//	a1[0][0].getName();

		ArraytoObject obj=new ArraytoObject("Manchester","3"); 
		//a1[0][0]=obj; 
		String nombre;
		String logros;
		
		for(int i=0; i<a1.length; i++)
		{
			for(int j=0; j<a1.length; j++) {
				System.out.println("Ingresa el nombre");
				nombre=sc.next();
				System.out.println("Ingresa los logros");
				logros=sc.next(); 
				a1[i][j]=new ArraytoObject(nombre,logros); 
				
			}
		}	
		
		for (ArraytoObject[] name: a1) {
			for(ArraytoObject na:name) {
				System.out.println(na.getName()+"los logros son " + na.getWins());
			}
		}
		
	}}
		