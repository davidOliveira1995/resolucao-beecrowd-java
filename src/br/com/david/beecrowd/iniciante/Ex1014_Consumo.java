package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1014_Consumo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Distância total percorrida: ");
        int x = scan.nextInt();

        System.out.print("Combustível gasto: ");
        double y = scan.nextDouble();

        double total = x / y;

        System.out.printf("%.3f km/l", total);


        scan.close();
    }
}
