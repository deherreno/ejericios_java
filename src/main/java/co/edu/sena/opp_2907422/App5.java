package co.edu.sena.opp_2907422;

import java.util.Scanner;

public class App5 {
     public static void main(String[] args) {
              
         System.out.println("Area y volumen de un cilindro");         
         Scanner cilindro = new Scanner(System.in);           
         System.out.println("Ingrese la radio del cilindro");         
         double radio = cilindro.nextDouble();           
         System.out.println("Ingrese la altura del cilindro");         
         double altura = cilindro.nextDouble();           
         double area = 2 * Math.PI * radio *(radio + altura ) ;         
        double volumen= Math.PI * Math.pow(radio,2) * altura;
         System.out.println("El area del cilindro es " +area+"y el volumen del cilindro es: "+volumen );         
    }
}
