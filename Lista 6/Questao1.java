//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[5];
        int vezes = 0;

        for (int i = 0; i < vetor.length; i++) {
            vezes++;
            System.out.println("Digite o numero " + vezes + " :");
            vetor[i] = scanner.nextInt();

        }
        System.out.println("Numeros digitados: ");

        for (int i = 0; i < vetor.length; i++)
        System.out.println(vetor[i]);

        scanner.close();
    }
}
