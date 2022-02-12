package Clases;

/**
 *  
 * El <b>objetivo</b> de esta clase es proporcionar un resultado.
 * Tendra diferentes metodos para realizar operaciones
 * tales como <b>suma</b> de numeros enteros, numeros reales y
 * suma con valor acumulado
 * 
 * @author SABRINA CACERES
 * @version 1.0
 * 
 **/

public class Suma {

    /**
     * <strong>Atributos de la clase </strong>
     * Valores enteros, reales y acumulados
     */
	
	 //Numeros enteros
	
	 private int n1;
	 private int n2;
	 public static int acumulador;
	   
	 // Numeros reales 
	   
	 private double n3;
	 private double n4;
         private double n5;
	 public static double acumula;
	   
	   // Zona de constructores
	   
	 public  Suma() { 
	   this.n1=0;
	   this.n2=0;
	   this.n3=0;
	   this.n4=0;
	   this.n5=0;
		   
	 }	
	 
	 public Suma(int n1, int n2) {	   
	   this.n1 = n1;
	   this.n2 = n2;
	 }   
	 public Suma(double n3, double n4,double n5) {	   
	   this.n3 = n3;
	   this.n4 = n4;
	   this.n5 = n5;
	 }  
	    
	   // Zona de getter y setter
	   
	 public int getN1() {
	   return this.n1;
	 }
	 
	 public void setN1(int n1) {
	   this.n1 = n1;
	 }
	 public int getN2() {
	   return this.n2;
	 }
	 public  void setN2(int n2) {
	   this.n2 = n2;
	 }
	 public double getN3() {
	   return this.n3;
	 }
	 public void setN3(double n3) {
	   this.n3 = n3;
	 }
	 public double getN4() {
	   return this.n4;
	 }
	 public void setN4(double n4) {
	   this.n4 = n4;
	 }
	 public double getN5() {
	   return this.n5;
	 }
	 public void setN5(double n5) {
	   this.n5 = n5;
	 }

	/**
	 * Estos metodos (1 y 2) suman dos valores enteros o reales
	 * asignando el resultado a una variable (result)
	 * tambien los acumula (acumulador)
	 * y devuelve un valor numerico.
	 * 
	 * 
	 * @param N1 Y N2 Valor numerico del entero
	 * @param N3 Y N4 Valor numerico reales
	 * @param RESUL Valor numerico de la operacion
	 * @param Acumulador valor numerico de suma de acumulados    
	 * @return Devuelve el resultado de la operacion
	 * 
	 */
	   
	 public int resultado() { //Metodo 1
	   int resul=this.getN1()+this.getN2();
	   acumulador+=resul;
	   return resul;	  
     }
	  
	 public double dosReales() { //Metodo 2
	   double resul =this.getN3()+this.getN4();
	   acumula+=resul;
	   return resul; 
	 } 
	   
	   
	/** 
	 * Este metodo suma tres valores reales
	 * Asignando el resultado a una variable (result)
	 * tambien los acumula(acumulador)
	 * y devuelve un valor numerico.
	 * 
	 * @param N3 N4 N5 Valores numericos reales
	 * @param result valor numerico de la operacion
	 * @param acumulador valor numerico de suma acumulados
	 * @return Devuelve el resultado de la operacion
	 * 
	 */
	   
	 public double tresReales() {
	   double resul =this.getN3()+this.getN4()+this.getN5();
	   acumula+=resul;
	   return resul;
	 }
	   
	 /**
	  * Este metodo acumula el valor de las sumas 
	  * devuelve el resultado total
	  * 
	  * @return Devuelve el valor acumulador
	  */
	   
	 public int cuentaAcumulador() {
	   return acumulador;
	 }
	   
	   
     /**
	  * Este metodo acumula el valor de las sumas
	  * devuelve el resultado total
	  * 
	  * @return Devuelve el resultado acumulado
	  */
	 public double cuentaAcumula() {
	   return acumula;
     }

	
}
