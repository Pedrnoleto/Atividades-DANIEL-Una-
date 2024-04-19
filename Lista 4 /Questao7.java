/*  Faça um programa que leia 5 números e informe o maior número. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int i;

        for (i = 1; i <= 5; i++)

        {
            System.out.println("Digite 5 números inteiros: ");
            numero = scanner.nextInt();

            if (numero > maior)
                ;
            {
                maior = numero;
            }
        }

        System.out.println("Seu numero maior foi: " + maior);

        scanner.close();
    }
}
