package junit5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Clases.Cociente;
class CalculadoraTest {
	
	@Test 
	public void  DivisionEnteroEquals() {
		Cociente obj = new Cociente();
		int resultadoObtenido = obj.DivisionEntero(10,2); 
		int resultadoEsperado = 5;
		assertEquals(resultadoObtenido,resultadoEsperado);
		if (resultadoObtenido == resultadoEsperado) {
			System.out.println("Test DivisionEnteroEquals Satisfactoria ");
		}
	}

	@Test 
	public void  DivisionEnteroNotEquals() {
		Cociente obj = new Cociente();
		int resultadoObtenido = obj.DivisionEntero(10,2); 
		int resultadoEsperado = 6;
		assertNotEquals(resultadoObtenido,resultadoEsperado);
		System.out.println("Testa DivisionEnteroNotEquals Satisfactoria ");
	}
	@Test 
	public void  DivisionDoubleEquals() {
		Cociente obj = new Cociente();
		Double resultadoObtenido = obj.DivisionReal(10.0,2.0); 
		Double resultadoEsperado = 5.0;
		assertEquals(resultadoObtenido,resultadoEsperado);
		System.out.println("Test DivisionDoubleEquals Satisfactoria ");	
	}
	@Test 
	public void  DivisionDoubleNotEquals() {
		Cociente obj = new Cociente();
		Double resultadoObtenido = obj.DivisionReal(10.0,2.0); 
		Double resultadoEsperado = 5.5;
		assertNotEquals(resultadoObtenido,resultadoEsperado);
		System.out.println("Test DivisionDoubleNotEquals Satisfactoria");			
	}
	@Test 
	public void  RaizEquals() {
		Cociente obj = new Cociente();
		int resultadoObtenido = (int) obj.Raiz(25); 
		int resultadoEsperado = 5;
		assertEquals(resultadoObtenido,resultadoEsperado);
		System.out.println("Test RaizEquals Satisfactoria ");
	}
	@Test 
	public void  RaizNotEquals() {
		Cociente obj = new Cociente();
		int resultadoObtenido = (int) obj.Raiz(25); 
		int resultadoEsperado = 6;
		assertNotEquals(resultadoObtenido,resultadoEsperado);
		System.out.println("Test RaizNotEquals Satisfactoria ");
	}
	@Test 
	public void  InversoRealEquals() {
		Cociente obj = new Cociente();
		int resultadoObtenido =(int)obj.InversoReal(123); 
		int resultadoEsperado = 321;
		assertEquals(resultadoObtenido,resultadoEsperado);
		System.out.println("Test InversoRealEquals Satisfactoria ");
	}
	@Test 
	public void  InversoRealNotEquals() {
		Cociente obj = new Cociente();
		int resultadoObtenido =(int)obj.InversoReal(123); 
		int resultadoEsperado = 322;
		assertNotEquals(resultadoObtenido,resultadoEsperado);
		System.out.println("Test InversoRealNotEquals Satisfactoria ");
		}
	}	
		
	



	  
  