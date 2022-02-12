package Clases;
/**
 * El objetivo de esta clase es la <b>multiplicaci�n y potencia de n�meros enteros y reales</b>.
 * 
 * Tendr� diferentes m�todos para realizar acciones tales como multiplicar 2 n�mero reales, 2 enteros,
 * 3 reales o la potencia de un n�mero.
 * 
 * @author Jesus
 * @version 1.0
 */
public class Producto {
	/**
	 * Con este m�todo introducimos dos n�meros reales y nos
	 * devuelve el producto de ambos.
	 * 
	 * @param numero1 Primer n�mero real del producto.
	 * @param numero2 Segundo n�mero real del producto.
	 * @return Multiplicaci�n de ambos n�meros.
	 */
	public static double multiplicacion(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * Con este m�todo introducimos dos n�meros enteros y nos
	 * devuelve el producto de ambos.
	 * 
	 * @param numero1 Primer n�mero entero del producto.
	 * @param numero2 Segundo n�mero real del producto.
	 * @return Multiplicaci�n de ambos n�meros.
	 */
	public static int multiplicacion(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * Con este m�todo introducimos tres n�meros reales y nos
	 * devuelve el producto de los tres.
	 * 
	 * @param numero1 Primer n�mero real del producto.
	 * @param numero2 Segundo n�mero real del producto.
	 * @param numero3 Tercer n�mero real del producto.
	 * @return Multiplicaci�n de los tres n�meros.
	 */
	public static double multiplicacion(double numero1, double numero2, double numero3) {
		double resultado = numero1 * numero2 * numero3;
		return resultado;
	}
	
	/**
	 * Con este m�todo introducimos un n�mero que ser� la base de la potencia
	 * y otro n�mero que ser� el exponente.
	 * 
	 * @param base La base de la potencia.
	 * @param exponente El exponente de la potencia.
	 * @return Resultado de la potencia.
	 */
	public static int potencia(int base, int exponente) {
		int resultado = (int) Math.pow(base, exponente);
		return resultado;
				
		
	}

}
