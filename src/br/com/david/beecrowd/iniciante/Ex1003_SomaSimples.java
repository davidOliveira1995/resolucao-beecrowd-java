package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1003_SomaSimples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        int a = scan.nextInt();

        System.out.print("B: ");
        int b = scan.nextInt();

        int soma = a + b;

        System.out.println("SOMA = " + soma);

        scan.close();
    }
}
