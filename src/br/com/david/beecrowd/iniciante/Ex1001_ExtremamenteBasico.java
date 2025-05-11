package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1001_ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor A: ");
        int a = scan.nextInt();

        System.out.print("valor B: ");
        int b = scan.nextInt();

        int soma = a + b;

        System.out.println("X = " + soma);
        scan.close();
    }
}
