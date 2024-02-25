package co.edu.sena.opp_2907422;

import java.util.Scanner;

public class App4 {
     public static void main(String[] args) {
        System.out.println("Area y Perimetro de un cuadrado");
        System.out.println("Ingrese el lado del cuadrado");
        Scanner src= new Scanner (System.in);
        double lado = src.nextDouble();
        double area = lado * lado;
        double perimetro = lado * 4;
        System.out.println("El area del cuadrado es: " + area +" y el perimetro:" + perimetro);
    }
}
