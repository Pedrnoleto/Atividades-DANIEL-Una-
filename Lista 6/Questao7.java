/*Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a 
multiplicação e os números. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];
        int todos = 0;

        System.out.println("Digite 5 números inteiros");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + " número: ");
            vetor[i] = scanner.nextInt();

        }

        double soma = 0;
        for (int j = 0; j < vetor.length; j++) {
            soma += vetor[j];
        }

        double multiplicação = 1;
        for (int k = 0; k < vetor.length; k++) {
            multiplicação *= vetor[k];

        }

        System.out.println("\nNúmeros digitados: ");

        for (int numero : vetor) {
            System.out.print(numero + " ");
        }

        System.out.println("\nSoma dos números digitados: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicação);

    }
}
