//fichero Interes.java
//leemos desde un Scanner los valores
//capital, tiempo y tasa de  interés
//y mediante el  método calcularInteres de la
//clase  Interes muestra por pantalla el interés
//calculado

import java.util.Scanner;
public class TesInteres{
   public static void main(String[] arg){
	   Scanner banco=new Scanner (System.in);
        //preparamos el scanner
        System.out.println("Introduce el valor del capital, tiempo y tasa de interés: ");
        //lectura de lo datos
        double capital=banco.nextDouble();
        double tasaInteres=banco.nextDouble();
        double tiempo=banco.nextDouble();
        //llamada al método calcularInteres
        System.out.println("El interes proporcional es: "+Interes.calcularInter(capital,tasaInteres,tiempo));
        //mostramos por pantalla el valor del interés
       
   }
}
