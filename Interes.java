//fichero Interes.java
//Clase el interés (I) que produce un capital
//el cúal  es directamente proporcional al capital inicial (C),
// al tiempo (t), y a la tasa de interés (i) :
//I = C · i · t
/**
	*@author Maria Jose
	*@version Prueba 1.0
	* 
	*  **/

public class Interes{
public static double calcularInter(double capital, double tiempo, double tasaInteres){
   //código para calcular el interes
   double interes=0;
   interes= capital*tiempo*tasaInteres;
   //return interes
	return interes;
	}
}
