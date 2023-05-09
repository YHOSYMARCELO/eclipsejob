package poryectoMartha;
/**
 * Delaración de la Clase 
 * @author Joselyn
 *
 */
public class Auto {
	//Declaracion d elos atributos privados 
	private String patente;
	private String marca;
	private double precio; 
	private String color;
	private Motor motor;
	
	/**
	 * Creacion del constructor
	 * @param patente entrada de un atributo 
	 * @param marca		entrada de un atributo 
	 * @param precio entrada de un atributo 
	 * @param color entrada de un atributo 
	 * @param motor entrada de un atributo 
	 */
	public Auto(String patente, String marca, double precio, String color, Motor motor) {
		
		this.patente = patente;
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.motor = motor;
	}
	/**
	 * 
	 * @return patente the patente to get
	 */
	public String getPatente() {
		return patente;
	}
	
	/** 
	 * 
	 * @param patente the patente to set 
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	/**
	 * 
	 * @return marca  the marca to get 
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * 
	 * @param marca the marca to set 
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * 
	 * @return precio the precio to get
	 */
	public double getPrecio() {
		return precio;
	}
	
	
	/**
	 * 
	 * @param precio the precio to set 
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**
	 * 
	 * @return color the color to set 
	 */
	public String getColor() {
		return color;
	}
	/**
	 * 
	 * @param color the color to set 
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	/**
	 * 
	 * @return motor the motor to get
	 */
	public Motor getMotor() {
		return motor;
	}
	/**
	 * 
	 * @param motor the moto to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", marca=" + marca + ", precio=" + precio + ", color=" + color + ", motor="
				+ motor + "]";
	}


	
}
