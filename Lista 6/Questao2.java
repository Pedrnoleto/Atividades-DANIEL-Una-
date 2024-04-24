// Faça um Programa que leia um vetor de 10 números reais e mostre-os na 
//ordem inversa. 

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vetor[] = new double[10];
        int vezes = 0;

        for (int i = 0; i < vetor.length; i++) {
            vezes++;
            System.out.println(vezes + "- Digite o um valor real: ");
            vetor[i] = scanner.nextDouble();

        }

        System.out.println("\n Agora em ordem inversa: ");

        for (int i = vetor.length - 1; i >= 0; i--) {

            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
