package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1011_Esfera {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o Raio: ");
        int raio = scan.nextInt();
        double pi = 3.14159;
        double volume = (4.0/3.0) * pi * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f", volume);


        scan.close();
    }
}
