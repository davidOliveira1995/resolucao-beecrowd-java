package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1015_DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("X1: ");
        double x1 = scan.nextDouble();

        System.out.print("Y1: ");
        double y1 = scan.nextDouble();

        System.out.print("X2: ");
        double x2 = scan.nextDouble();

        System.out.print("Y2: ");
        double y2 = scan.nextDouble();

        System.out.println();

        double calcX = x2 - x1;
        double calcY = y2 - y1;
        double distancia = Math.sqrt(Math.pow(calcX,2) + Math.pow(calcY,2));

        System.out.printf("%.4f", distancia);



        scan.close();
    }
}
