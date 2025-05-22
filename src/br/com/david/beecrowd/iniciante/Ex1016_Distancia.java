package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1016_Distancia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double velocidadeCarroX = 60;
        double velocidadeCarroY = 90;

        double velocidadeRelativa = velocidadeCarroY - velocidadeCarroX;
        double kmPorMinutos = velocidadeRelativa / 60;

        System.out.print("Distância: ");
        double distancia = scan.nextDouble();

        double tempo = distancia / kmPorMinutos;

        System.out.printf("%.0f minutos", tempo);

        scan.close();
    }
}
