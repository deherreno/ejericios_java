package co.edu.sena;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        System.out.println("Longitud de la circunferencia y area");
        System.out.println("Ingrese el radio");
        Scanner src= new Scanner (System.in);
        double radio = src.nextDouble();
        double longitud= 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de circunferencia es de: " + longitud+ "y el area del circulo es: " + area);
    }
}
