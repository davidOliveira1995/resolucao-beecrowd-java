package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1010_CalculoSimples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Código da peça: ");
        int codItemUm = scan.nextInt();

        System.out.print("Quantidade: ");
        int qtdItemUm = scan.nextInt();

        System.out.print("Valor unitário: R$ ");
        double valorItemUm = scan.nextDouble();

        System.out.print("Código da peça: ");
        int codItemDois = scan.nextInt();

        System.out.print("Quantidade: ");
        int qtdItemDois = scan.nextInt();

        System.out.print("Valor unitário: R$ ");
        double valorItemDois = scan.nextDouble();

        double soma = qtdItemUm * valorItemUm + qtdItemDois * valorItemDois;

        System.out.printf("VALOR A PAGAR: R$ %.2f", soma);
        scan.close();
    }
}
