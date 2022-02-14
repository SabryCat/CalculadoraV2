package Clases;

public class Principal {

	public static void main(String[] args) {

		System.out.println(Producto.potencia(2, 3));//Prueba del método potencia de la clase Producto de Jesús
		
		//Parte de Sabry
		Suma uno   = new Suma(10,20);
		Suma unoA  = new Suma(5,10);
		Resta dos   = new Resta(50,20);
		Resta dosA  = new Resta(10,5);
	
		int resultado=uno.resultado() ;
		System.out.println("El resultado Suma uno es:"+ resultado);
		int resultadoA=unoA.resultado() ;
		System.out.println("El resultado Suma unoA es:"+ resultadoA);
		System.out.println("Total de enteros Suma es : " + uno.cuentaAcumulador());
		System.out.println();
		
		int total=dos.resultado() ;
		System.out.println("El resultado Resta dos es:"+ total);
		int totalA=dosA.resultado() ;
		System.out.println("El resultado Resta dosA es:"+ totalA);
		System.out.println("Total de enteros Resta es : " + dos.cuentaAcumulador());
		//Finaliza la parte de Sabry
		
		// Parte de Nabil Makrane
		Cociente obj = new Cociente();
		double resultadoReal = obj.DivisionReal(10, 2);
		int resultadoEntero = obj.DivisionEntero(10, 2);
		int resultadoInverso = obj.InversoReal(-10);
		double resultadoRaiz = obj.Raiz(25);
				
		System.out.println("El resultado  cociente real es:"+ resultadoReal);
		System.out.println("El resultado cociente entero es:"+ resultadoEntero);
		System.out.println("El resultado cociente inverso es:"+ resultadoInverso);
		System.out.println("El resultado cociente raiz es:"+ resultadoRaiz);
		// Fin parte de Nabil Makrane
		
	}		
	

}
