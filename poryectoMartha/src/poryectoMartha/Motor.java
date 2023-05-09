package poryectoMartha;
/**
 * Creacion de clase Motor
 * @author Joselyn
 *
 */
public class Motor {
	private String numero; 
	private double cilindradas; 
	private String tipo;
	
	/**
	 * Creacion del Constructor
	 * @param numero entrada de un atributo
	 * @param cilindradas entrada de un atributo
	 * @param tipo entrada de un atributo
	 */
	public Motor(String numero, double cilindradas, String tipo) {
	
		this.numero = numero;
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}
	/**
	 * 
	 * @return numero to get
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * 
	 * @param numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * 
	 * @return cilindrada to get
	 */
	public double getCilindradas() {
		return cilindradas;
	}
	/**
	 * 
	 * @param cilindradas to set
	 */
	public void setCilindradas(double cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	/**
	 * 
	 * @return tipo to get
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * 
	 * @param tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Motor [numero=" + numero + ", cilindradas=" + cilindradas + ", tipo=" + tipo + "]";
	} 
	
}
