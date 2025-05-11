package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1006_Media2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        double a = scan.nextDouble();

        System.out.print("B: ");
        double b = scan.nextDouble();

        System.out.print("C: ");
        double c = scan.nextDouble();

        double media = (a * 2 + b * 3 + c * 5) / 10.0;

        System.out.printf("MEDIA = %.1f", media);

        scan.close();
    }
}
