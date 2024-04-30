/*Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene 
num vetor a média de cada aluno, imprima o número de alunos com média 
maior ou igual a 7.0. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[10];
        double media;
        int vezes = 0;
        for (int i = 0; i < 10; i++) {
            vezes = 0;
            for (int j = 0; j < 4; j++) {
                vezes++;
                System.out.println("Digite a " + vezes + "ª nota do aluno " + (i + 1) + ": ");
                vetor[j] = scanner.nextDouble();
            }
            double soma = 0;
            for (int k = 0; k < 4; k++) {
                soma += vetor[k];
            }
            media = soma / 4;
            if (media >= 7.0) {
                System.out.println("A média do aluno " + (i + 1) + " é: " + media);
            }
        }
        scanner.close();
    }
}
