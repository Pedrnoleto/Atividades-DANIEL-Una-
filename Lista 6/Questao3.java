// Faça um Programa que leia 4 notas, mostre as notas e a média na tela. 


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[4];
        double media = 0.0;

        System.out.println("Calcule a média de suas notas");
        for (int i = 0; i < 4; i++) {
            int vezes = i + 1;
            System.out.println("Digite sua nota " + vezes + ":");
            vetor[i] = scanner.nextDouble();
            media += vetor[i];
        }

        media = media / 4;

        System.out.println("Notas digitadas:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + vetor[i]);

        }

        System.out.println("Média das notas: " + media);
        scanner.close();
    }
}
