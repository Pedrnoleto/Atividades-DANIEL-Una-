
/* Faça um programa que receba a temperatura média de cada mês do ano e 
armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e 
mostre todas as temperaturas acima da média anual, e em que mês elas 
ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).  */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vetor[] = new double[12];
        String mes[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };
        double somaanual = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite a temperatura do mês " + mes[i] + " :");
            vetor[i] = scanner.nextDouble();

            somaanual += vetor[i];
        }

        double mediaanual = somaanual / 12;

        System.out.println("\n");
        System.out.println("Média anual: " + mediaanual);

        System.out.println("Temperaturas acima da média anual: ");

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > mediaanual) {
                System.out.println("Temperatudo de " + mes[j] + ":" + vetor[j]);

            }
        }

        scanner.close();
    }
}
