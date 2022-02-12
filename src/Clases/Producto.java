package Clases;
/**
 * El objetivo de esta clase es la <b>multiplicación y potencia de números enteros y reales</b>.
 * 
 * Tendrá diferentes métodos para realizar acciones tales como multiplicar 2 número reales, 2 enteros,
 * 3 reales o la potencia de un número.
 * 
 * @author Jesus
 * @version 1.0
 */
public class Producto {
	/**
	 * Con este método introducimos dos números reales y nos
	 * devuelve el producto de ambos.
	 * 
	 * @param numero1 Primer número real del producto.
	 * @param numero2 Segundo número real del producto.
	 * @return Multiplicación de ambos números.
	 */
	public static double multiplicacion(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * Con este método introducimos dos números enteros y nos
	 * devuelve el producto de ambos.
	 * 
	 * @param numero1 Primer número entero del producto.
	 * @param numero2 Segundo número real del producto.
	 * @return Multiplicación de ambos números.
	 */
	public static int multiplicacion(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		return resultado;
	}
	
	/**
	 * Con este método introducimos tres números reales y nos
	 * devuelve el producto de los tres.
	 * 
	 * @param numero1 Primer número real del producto.
	 * @param numero2 Segundo número real del producto.
	 * @param numero3 Tercer número real del producto.
	 * @return Multiplicación de los tres números.
	 */
	public static double multiplicacion(double numero1, double numero2, double numero3) {
		double resultado = numero1 * numero2 * numero3;
		return resultado;
	}
	
	/**
	 * Con este método introducimos un número que será la base de la potencia
	 * y otro número que será el exponente.
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
