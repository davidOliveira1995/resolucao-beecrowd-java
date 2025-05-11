package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1007_Diferenca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        int a = scan.nextInt();

        System.out.print("B: ");
        int b = scan.nextInt();

        System.out.print("C: ");
        int c = scan.nextInt();

        System.out.print("D: ");
        int d = scan.nextInt();

        int diferenca = a * b - c * d;

        System.out.print("DIFERENCA = " + diferenca);
        scan.close();
    }
}
