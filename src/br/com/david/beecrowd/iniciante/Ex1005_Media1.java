package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1005_Media1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        double a = scan.nextDouble();

        System.out.print("B: ");
        double b = scan.nextDouble();

        double media = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f", media );

        scan.close();
    }
}
