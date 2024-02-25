package co.edu.sena.opp_2907422;

import java.util.Scanner;

public class App3 {
     public static void main(String[] args) {
        System.out.println("Euro a Dolar");
        System.out.println("Ingrese la cantidad de euros");
        Scanner src= new Scanner (System.in);
        double euro = src.nextDouble();
        System.out.println("Ingrese el precio del dolar");
        double dolar = src.nextDouble();
        double result = (euro * dolar);
        System.out.println("La cantidad de dolares son " + result);
    }
}
