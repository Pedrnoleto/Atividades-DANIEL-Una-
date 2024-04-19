/*  Faça um programa que leia 5 números e informe a soma e a média dos 
números. */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = 0;
        double resultadomedia;
        double resultadosoma = 0;
        double i;

        for (i = 1; i <= 5; i++)

        {
            System.out.println("Escreva 5 números para obter a soma e a média: ");
            num = scanner.nextDouble();
            resultadosoma += num;
        }
        resultadomedia = resultadosoma / 5;

        System.out.println("A média dos números é: " + resultadomedia);
        System.out.println("O resultado da soma é: " + resultadosoma);

    }
}
