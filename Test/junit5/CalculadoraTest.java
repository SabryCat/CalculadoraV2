package junit5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Clases.Cociente;
import Clases.Resta;
import Clases.Suma;
import Clases.Producto;

class CalculadoraTest {
	
	//Comienzo de las pruebas de los métodos de la clase Suma
		@Test
		public void testResultado() {
			Suma sumaenteros1 = new Suma(3, 5);
			assertEquals(8, sumaenteros1.resultado());
			}
		
		@Test
		public void testCuentaAcumulador() {

			Suma sumaEnteros1 = new Suma(3, 5);
			Suma sumaEnteros2 = new Suma(1, 2);
			sumaEnteros1.resultado();
			sumaEnteros2.resultado();
			assertEquals(11,sumaEnteros1.cuentaAcumulador());
			}
		
		@Test
		public void testDosReales() {
			Suma sumareales1 = new Suma(3.5, 6.5);
			//assertEquals(10.0, sumareales1.dosReales());
			assertEquals (10.0,sumareales1.dosReales());
			}
		
		@Test
		public void testCuentaAcumula() {
			Suma sumareales1 = new Suma(3.5, 6.5);
			Suma sumareales2 = new Suma(3.5,6.5);
			sumareales1.dosReales();
			sumareales2.dosReales();
			assertEquals(20.0, sumareales2.cuentaAcumula());//con 2 objetos que tenían 2 reales como argumentos
			
			Suma sumareales3 = new Suma(2.5, 2.5, 5.0);
			sumareales3.tresReales();
			assertEquals(30.0, sumareales3.cuentaAcumula());//sumo un tercer objeto con 3 reales como argumento
			}
		
		@Test
		public void testTresReales() {
			Suma sumareales1 = new Suma(2.5, 2.5, 5.0);
			assertEquals(10,sumareales1.tresReales());
		}
		
		//Comieno de las pruebas de los métodos de la clase Resta	
		@Test
		public void testResultadoResta() {
			Resta restaenteros = new Resta(5, 4);
			assertEquals(1,restaenteros.resultado());
		}
		
		public void testDosRealesResta() {
			Suma D = new Suma(11.1,22.2);
			//Resta restareales = new Resta(7.5, 2.5);
			assertEquals(5.0,D.dosReales());
		}
		public void testTresRealesResta() {
			Resta restareales = new Resta(7.5, 2.5, 5);
			assertEquals(0.0, restareales.tresReales());
		}
		
		public void testcuentaAcumuladorResta() {
			Resta restaenteros1 = new Resta(5, 4);
			Resta restaenteros2 = new Resta(4, 6);
			restaenteros1.resultado();
			restaenteros2.resultado();
			assertEquals(-1, restaenteros1.cuentaAcumulador());
		}
		public void testcuentaAcumulaResta() {
			Resta restareales1 = new Resta(7.5, 2.5);//Creo un objeto de 2 reales
			Resta restareales2 = new Resta(7.5, 2.5, 5.0);//Creo un objeto de 3 reales
			restareales1.dosReales();
			restareales2.tresReales();
			assertEquals(5.0,restareales1.cuentaAcumula());//aplico el método de cuentaAcumula de reales y comparo con resultado esperado
		}
		
	    @Test
	    public void TestProductoEnteros () {

	        int resultadoEsperado = 20;
	        int resultadoObtenido = Producto.multiplicacion(10, 2);
	        assertEquals (resultadoEsperado, resultadoObtenido);

	    }

	    //Test numeros reales
	    @Test 
	    public void TestProductoReales () {

	        double resultadoEsperado = 20.0;
	        double resultadoObtenido = Producto.multiplicacion(10.0, 2.0);
	        assertEquals(resultadoEsperado, resultadoObtenido);
	    }

	    //Test triple producto
	    @Test
	    public void TestTripleProducto () {

	        double resultadoEsperado = 40;
	        double resultadoObtenido = Producto.multiplicacion(10, 2, 2);
	        assertEquals (resultadoEsperado,resultadoObtenido);

	    }
	    //Test de la potencia
	    @Test
	    public void TestPotencia() {

	        int resultadoEsperado = 25;
	        int resultadoObtenido = Producto.potencia(5,2);
	        assertEquals (resultadoEsperado, resultadoObtenido);

	    }

		
}
	



	  
  