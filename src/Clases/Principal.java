package Clases;

public class Principal {

	public static void main(String[] args) {


		System.out.println("Hola Grupo V2");
		
		
		System.out.println(Producto.potencia(2, 3));//Prueba del m�todo potencia de la clase Producto de Jes�s
		
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
		
	}		
	

}
