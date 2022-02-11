package Clases;

public class Principal {

	public static void main(String[] args) {
		
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
		
		
	}		
	

}
