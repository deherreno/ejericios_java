package co.edu.sena.opp_2907422;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        System.out.println("Promedio de 3 números");
        System.out.println("Ingrese el primer número");
        Scanner src= new Scanner (System.in);
        double not1 = src.nextDouble();
        System.out.println("Ingrese el segundo número");
        double not2 = src.nextDouble();
        System.out.println("Ingrese el tercer número");
        double not3 = src.nextDouble();
        double promedio = (not1 + not2+ not3)/2;
        System.out.println("El promedio de los numeros ingresados es : "+ promedio);

    }
}
