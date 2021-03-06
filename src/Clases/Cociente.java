package Clases;

/**
 * El objetivo de esta clase <b>es realizar divisiones mediante diferentes metodos.</b>
 * Con numeros reales, enteros, el inverso de un numero real y la raiz de un numero.
 * @author NABIL MAKRANE
 * @version 1.0
 */

/**
 * public class cociente {
 * Atributos de la clase
 * Valores enteros, reales, inverso de un n?mero y su raiz.
 */
public class Cociente {

/** Se crean 4 metodos (DivisionReal, DivisionEntero, InversoReal y Raiz).

/**<h1>DivisionReal</h1>
*El metodo DivisionReal dividir? dos numeros reales.
@param numero1 dividendo.
@param numero2 divisor.
@return devuelve la divisi?n de los dos numeros reales.
*/
	public double DivisionReal (double n1, double n2) {
	 		return n1 / n2;
	 	}
	 	
/**
*<h1>DivisionEntero</h1>
*El metodo DivisionEntero dividir? dos numeros enteros.
*@param numero1 dividendo.
*@param numero2 divisor.
*@return devuelve la divisi?n de los dos numeros enteros.
*/	
	 	
	 	public int DivisionEntero (int n1, int n2) {
			return n1 / n2;
		}
	 	
/**
*<h1>InversoReal</h1>
*El metodo InversoReal realizar? el inverso de un numero real.
*/ 	
	 	
	    public int InversoReal(int numero){
	        int cifra, inverso = 0;
	        while(numero!=0){
	            cifra = numero%10;
	            inverso = (inverso * 10) + cifra;
	            numero/=10;
	        }
	        return inverso;
	    }
		
/**
*<h1>Raiz</h1>
*El metodo Raiz realizar? la raiz cuadrada de un numero.
*@param n1 Es el par?metro que se le pasa al metodo para hallar la ra?z cuadrada.
*@return Devuelve la ra?z cuadrada del parametro (numero).
*/
		
	 	public	double Raiz (int n1) {
			return Math.sqrt(n1); 
		}

}

	/**
	*<h3>?Qu? ocurre cuando alguno de los par?metros de entrada es cero?</h3>
	*Cuando un parametro de entrada es cero la division de los dos numeros no se realiza.
	
	*<h3>Supongamos que la calculadora no puede utilizar n?meros negativos ?C?mo lo documentar?amos?</h3>
	*lo documentamos con un @throws la excepci?n de un numero negativo en el metodo correspondiente.
	
	*<h3>?Qu? ocurrir?a si la divisi?n no da un n?mero exacto?</h3>
	*Si los numeros de la division son <b>double</b> el resultado lo dar? con decimales.
	*Si los numeros de la division son <b>enteros</b> el resultado lo dar? redondeado.
	*/