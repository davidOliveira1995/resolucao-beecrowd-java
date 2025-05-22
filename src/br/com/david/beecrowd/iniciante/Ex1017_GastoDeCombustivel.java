package br.com.david.beecrowd.iniciante;

import java.util.Scanner;

public class Ex1017_GastoDeCombustivel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Observação: O carro faz 12KM/L");
        double kmPorLitro = 12;

        System.out.print("Velocidade Média: ");
        int velocidadeMedia = scan.nextInt();

        System.out.print("Horas de viagens: ");
        int horasDeViagem = scan.nextInt();

        double distancia = velocidadeMedia * horasDeViagem;

        double calculoDeCombustivel = distancia / kmPorLitro;

        System.out.printf("%.3f", calculoDeCombustivel);
        scan.close();
    }
}
