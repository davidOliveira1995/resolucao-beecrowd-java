package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1018_Cedulas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor: R$ ");
        int valor = scan.nextInt();

        int sobra = 0;

        int cem = valor / 100;
        sobra = valor % 100;

        int cinquenta = sobra / 50;
        sobra = sobra % 50;

        int vinte = sobra / 20;
        sobra = sobra % 20;

        int dez = sobra / 10;
        sobra = sobra % 10;

        int cinco = sobra / 5;
        sobra = sobra % 5;

        int dois = sobra / 2;
        sobra = sobra % 2;

        int um = sobra / 1;

       System.out.println(cem + " nota(s) de R$ 100,00");
       System.out.println(cinquenta + " nota(s) de R$ 50,00");
       System.out.println(vinte + " nota(s) de R$ 20,00");
       System.out.println(dez + " nota(s) de R$ 10,00");
       System.out.println(cinco + " nota(s) de R$ 5,00");
       System.out.println(dois + " nota(s) de R$ 2,00");
       System.out.println(um + " nota(s) de R$ 1,00");

        scan.close();
    }
}
