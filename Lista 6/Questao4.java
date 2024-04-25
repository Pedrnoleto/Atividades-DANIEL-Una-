/*Faça um Programa que leia um vetor de 10 caracteres, e diga quantas 
consoantes foram lidas. Imprima as consoantes. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vetor[] = new String[10];
        int vezes = 0;

        System.out.println("digite 10 caracteres: ");
        for (int i = 0; i < vetor.length; i++) {
            vezes = i + 1;

            System.out.println("Digite o " + vezes + " caractere: ");
            vetor[i] = scanner.next();

        }
        // nao sao consoantes A,E,I,O,U

        System.out.println("As consoantes são: ");
        for (int i = 0; i < vetor.length; i++) {
            if (!"AEIOUaeiou".contains(vetor[i])) {
                System.out.println(vetor[i]);

            }
        }

        scanner.close();
    }
}
