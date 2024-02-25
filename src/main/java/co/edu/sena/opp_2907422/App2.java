package co.edu.sena.opp_2907422;

import java.util.Scanner;

public class App2 {
    public static void main( String[] args )
    {
        System.out.println("Número al cuadrado");
        System.out.println("Ingrese el  número");
        Scanner src= new Scanner (System.in);
        double num = src.nextDouble();
        double result = (num * num);
        System.out.println("El número elevado al cuadrado es: " + result);
    }
}
