package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1008_Salario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scan.nextInt();

        System.out.print("Horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();

        System.out.print("Valor por hora: ");
        double valorPorHora = scan.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.print("NUMBER = " + number);
        System.out.println();
        System.out.printf("SALARY = U$ %.2f", salario);

        scan.close();
    }
}
