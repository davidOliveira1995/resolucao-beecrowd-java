package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1009_SalarioComBonus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Salário Fixo: ");
        double salario = scan.nextDouble();

        System.out.print("Total venda: ");
        double comissao = scan.nextDouble();

        double total = salario + comissao * 0.15;

        System.out.printf("TOTAL = R$ %.2f", total);

        scan.close();
    }
}
