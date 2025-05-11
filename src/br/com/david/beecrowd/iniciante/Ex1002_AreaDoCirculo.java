package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1002_AreaDoCirculo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Valor do raio: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A=%.4f", area);
        scan.close();
    }
}
