/*   Faça um programa que receba dois números inteiros e gere os números 
inteiros que estão no intervalo compreendido por eles.  */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = 0;
        int numB = 0;
        int i;

        System.out.println("Digite o primeiro número: ");
        numA = scanner.nextInt();

        System.out.println("Digite agora o seugundo número: ");
        numB = scanner.nextInt();

        for (i = numA + 1; i < numB; i++) {

            System.out.print(i + " ");

        }

        scanner.close();
    }
}
