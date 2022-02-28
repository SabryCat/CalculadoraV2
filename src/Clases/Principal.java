package Clases;

public class Principal {

	public static void main(String[] args) {

		System.out.println(Producto.potencia(2, 3));//Prueba del método potencia de la clase Producto de Jesús
		System.out.println();
		
		//Parte de Sabry
		Suma uno   = new Suma(10,20);
		Suma unoA  = new Suma(5,10);
		Resta dos   = new Resta(50,20);
		Resta dosA  = new Resta(10,5);
		Suma tres   = new Suma();
		Suma cuatro  = new Suma();
		Suma cinco  = new Suma();
		Suma seis  = new Suma();
		
		tres.setN6(30.9);
		tres.setN7(40.4);
		cuatro.setN6(20.9);
		cuatro.setN7(20.1);
		
		cinco.setN3(90.5);
		cinco.setN4(9.5);
		cinco.setN5(1.5);
		seis.setN3(10.5);
		seis.setN4(11.5);
		seis.setN5(12.5);
	
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
		System.out.println();
		
		double dosReales= tres.dosReales() ;
		System.out.println("El resultado dosReales es:"+ dosReales);
		double dosRealesV=cuatro.dosReales() ;
		System.out.println("El resultado dosReales es:"+ dosRealesV);
		double tresReales=cinco.tresReales() ;
		System.out.println("El resultado tresReales:"+ tresReales);
		double tresRealesA=seis.tresReales() ;
		System.out.println("El resultado tresReales:"+ tresRealesA);
		System.out.println("Total de Reales es : " +seis.cuentaAcumula());
		System.out.println();
	
		//Finaliza la parte de Sabry
		
		// Parte de Nabil Makrane
		Cociente obj = new Cociente();
		double resultadoReal = obj.DivisionReal(10, 2);
		int resultadoEntero = obj.DivisionEntero(10, 2);
		int resultadoInverso = obj.InversoReal(123);
		double resultadoRaiz = obj.Raiz(25);
				
		System.out.println("El resultado  cociente real es:"+ resultadoReal);
		System.out.println("El resultado cociente entero es:"+ resultadoEntero);
		System.out.println("El resultado cociente inverso es:"+ resultadoInverso);
		System.out.println("El resultado cociente raiz es:"+ resultadoRaiz);
		// Fin parte de Nabil Makrane
		
	}		
	

}
