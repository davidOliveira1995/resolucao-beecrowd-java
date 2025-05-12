package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1012_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi = 3.14159;
        System.out.print("A: ");
        double a = scan.nextDouble();

        System.out.print("B: ");
        double b = scan.nextDouble();

        System.out.print("C: ");
        double c = scan.nextDouble();

        double triangulo = (a * c) / 2.0;
        double circulo = pi * Math.pow(c,2.0);
        double trapezio = ((a + b) * c) / 2.0;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f", triangulo);
        System.out.println();

        System.out.printf("CIRCULO: %.3f", circulo);
        System.out.println();

        System.out.printf("TRAPEZIO: %.3f", trapezio);
        System.out.println();

        System.out.printf("QUADRADO: %.3f", quadrado);
        System.out.println();

        System.out.printf("RETANGULO: %.3f", retangulo);

        scan.close();
    }
}
