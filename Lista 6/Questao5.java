/*Faça um Programa que leia 20 números inteiros e armazene-os num vetor. 
Armazene os números pares no vetor PAR e os números IMPARES no vetor 
ímpar. Imprima os três vetores. */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[20];
        int[] vetorPar = new int[20]; // Array para armazenar os números pares
        int[] vetorImpar = new int[20]; // Array para armazenar os números ímpares
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número inteiro: ");
            vetor[i] = scanner.nextInt();
        }
        int countPar = 0;
        int countImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                vetorPar[countPar] = vetor[i]; // Armazena número par
                countPar++;
            } else {
                vetorImpar[countImpar] = vetor[i]; // Armazena número ímpar
                countImpar++;
            }
        }
        System.out.println("Números pares:");
        for (int i = 0; i < countPar; i++) {
            System.out.print(vetorPar[i] + " ");
        }
        System.out.println();
        System.out.println("Números ímpares:");
        for (int i = 0; i < countImpar; i++) {
            System.out.print(vetorImpar[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
}
