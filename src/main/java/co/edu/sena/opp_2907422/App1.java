package co.edu.sena.opp_2907422;

import java.util.Scanner;

public class App1 {
    public static void main( String[] args )
    {
        System.out.println("Suma de 2 numeros");
        System.out.println("Ingrese el primer numero");
        Scanner src= new Scanner (System.in);
        double num1 = src.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double num2 = src.nextDouble();
        double result = (num1 + num2);
        System.out.println("La suma de los 2 numeros es: " + result);
    }
}