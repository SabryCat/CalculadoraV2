package Clases;

/**
 *  
 * El objetivo de esta clase es proporcionar un resultado.
 * Tendra diferentes metodos para realizar operaciones
 * tales como resta de numeros enteros, numeros  reales y
 *  resta con valor Acumulado.
 *  
 * @author sabrycat
 * @version 1.0
 */

public class Resta {

    /**
     * Atributos de la clase
     * Valores enteros, reales y acumulados
     * 
     * 
     */
	
	 // Numeros enteros
	
     private int n1;
     private int n2;
	 public static int acumulador;
	  
	 // Numeros reales
	
	 private double n3;
	 private double n4;
	 private double n5;
	 public static double acumula;
	   
	 // Zona de constructores
	 
 	 public  Resta() {
	   this.n1=0;
	   this.n2=0;
       this.n3=0;
	   this.n4=0;
	   this.n5=0;
		   
	 }	
	   
	 public Resta(int n1, int n2) {	   
	   this.n1 = n1;
	   this.n2 = n2;
	 }    
	 public Resta(double n3, double n4,double n5) {	   
	   this.n3 = n3;
	   this.n4 = n4;
	   this.n5 = n5;
	 }  
	    
	 //Zona de getter y setter
	   
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
	 * 
     * Estod metodos (1 y 2) resta dos valores enteros o reales
	 * asignando el resultado a una variable (resul)
	 * tambien los acumula (acumulador)
	 * y devuelve un valor numerico.
	 * 
	 * @param N1 Y N2 Valor numerico del entero
	 * @param N3 Y N4 Valor numerico reales
	 * @param Resul valor numerico de la operacion
	 * @param Acumulador valor numerico de resta acumulados
	 * @return devuelve el resultado de la operacion
	 * 
     */  
	 public int resultado() { //Metodo 1
	   int resul=this.getN1()-this.getN2();
	   acumulador+=resul;
	   return resul;
				
	 }
	 public double dosReales() { //Metodo 2
	   double resul =this.getN3()-this.getN4();
	   acumula+=resul;
	   return resul;
	 } 
	/**
	 * Este metodo resta tres valores reales
	 * asignando el resultado a una variable (resul)
	 * tambien los acumula (acumulador)
	 * y devuelve un valor numerico.
	 * 
	 * @param N3 N4 N5 Valores numericos reales
	 * @param result valor numerico de la operacion
	 * @param acumulador valor numerico de resta acumulados
	 * @return devuelve el resultado de la operacion
	 * 
	 */
	 
	 public double tresReales() {
	   double resul =this.getN3()-this.getN4()-this.getN5();
	   acumula+=resul;
			  return resul;
	 }
	/**
	 * 
	 * Este metodo acumula el valor de las resta
	 * devuelve el resultado total
	 * 
	 * @return Devuelve el valor acumulado
	 */
	 public int cuentaAcumulador() {
	   return acumulador;
	 }
	/**
	 * Este metodo acumula el valor de las resta
	 * devuelve el resultado total
	 * 
	 * 
	 * @return Devuelve el resultado acumulado
	 */
	 public double cuentaAcumula() {
	   return acumula;
	 }

}
