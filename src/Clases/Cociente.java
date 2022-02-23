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
 * Valores enteros, reales, inverso de un número y su raiz.
 */
public class Cociente {

/** Se crean 4 metodos (DivisionReal, DivisionEntero, InversoReal y Raiz).

/**<h1>DivisionReal</h1>
*El metodo DivisionReal dividirá dos numeros reales.
@param numero1 dividendo.
@param numero2 divisor.
@return devuelve la división de los dos numeros reales.
*/
	 	double DivisionReal (double n1, double n2) {
	 		return n1 / n2;
	 	}
	 	
/**
*<h1>DivisionEntero</h1>
*El metodo DivisionEntero dividirá dos numeros enteros.
*@param numero1 dividendo.
*@param numero2 divisor.
*@return devuelve la división de los dos numeros enteros.
*/	
	 	
	 	int DivisionEntero (int n1, int n2) {
			return n1 / n2;
		}
	 	
/**
*<h1>InversoReal</h1>
*El metodo InversoReal realizará el inverso de un numero real.
*/ 	
	 	
		int InversoReal (int n1) {
			if (n1 > 0)
				return n1 *-1;
			else
				return -n1;
		}
		
/**
*<h1>Raiz</h1>
*El mnetodo Raiz realizará la raiz cuadrada de un numero.
*@param n1 Es el parámetro que se le pasa al metodo para hallar la raíz cuadrada.
*@return Devuelve la raíz cuadrada del parametro (numero).
*/
		
		double Raiz (int n1) {
			return Math.sqrt(n1); 
		}
	 	
	public static void main(String[] args) {
		
		Cociente obj = new Cociente();
		double resultadoReal = obj.DivisionReal(10, 2);
		int resultadoEntero = obj.DivisionEntero(10, 2);
		int resultadoInverso = obj.InversoReal(-10);
		double resultadoRaiz = obj.Raiz(25);
		
		System.out.println(resultadoReal);
		System.out.println(resultadoEntero);
		System.out.println(resultadoInverso);
		System.out.println(resultadoRaiz);
	}
}

	/**
	*<h3>¿Qué ocurre cuando alguno de los parámetros de entrada es cero?</h3>
	*Cuando un parametro de entrada es cero la division de los dos numeros no se realiza.
	
	*<h3>Supongamos que la calculadora no puede utilizar números negativos ¿Cómo lo documentaríamos?</h3>
	*lo documentamos con un @throws la excepción de un numero negativo en el metodo correspondiente.
	
	*<h3>¿Qué ocurriría si la división no da un número exacto?</h3>
	*Si los numeros de la division son <b>double</b> el resultado lo dará con decimales.
	*Si los numeros de la division son <b>enteros</b> el resultado lo dará redondeado.
	*/