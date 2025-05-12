package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1013_oMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A: ");
        int a = scan.nextInt();

        System.out.print("B: ");
        int b = scan.nextInt();

        System.out.print("C: ");
        int c = scan.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");
        scan.close();
    }
}
