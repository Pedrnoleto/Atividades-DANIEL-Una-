/*  Faça um programa que imprima na tela apenas os números ímpares entre 1 e 
50.  */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;

        for (i = 0; i <= 49; i++) {

            i = i + 1;
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
