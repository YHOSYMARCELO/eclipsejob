
package poryectoMartha;
/**
 * Esta es una clase que define los atributos ques estarán integradas en la Clase 
 * @author Joselyn
 *
 */

public class ArraytoObject {
	String name; 
	String wins; 
	
	/**
	 * Este es un constructor vacio que será especificado por el usuario 
	 */
	public ArraytoObject(){
	
	}
	/**
	 * Constructor ue permite ingresar dos atributos con respectivos valores 
	 * @param nombre- valor ingresador por el usuario
	 * @param wing - valor ingresado por el usuario
	 */
	
	public ArraytoObject(String nombre, String wing) {
	
		this. name=nombre;
		this.wins=wing; 
	}
	/**
	@return  el name del nombre ingresado por el ususario
	*/
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name the name to set 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	@return  el name del nombre ingresado por el ususario
	*/
	public String getWins() {
		return wins;
	}
	/**
	 * 
	 * @param wins the wins to set
	 */
	public void setWins(String wins) {
		this.wins = wins;
	}

	@Override
	public String toString() {
		
		return "ArraytoObject [name=" + name + ", wins=" + wins + "]";
	}
	
	
	
}
