/* Supondo que a população de um país A seja da ordem de 80000 habitantes 
com uma taxa anual de crescimento de 3% e que a população de B seja 200000 
habitantes com uma taxa de crescimento de 1.5%. 
Faça um programa que calcule e escreva o número de anos necessários para 
que a população do país A ultrapasse ou iguale a população do país B, 
mantidas as taxas de crescimento.  */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = 80000;
        double taxaa = 0.03;
        int B = 200000;
        double taxab = 0.015;
        int ano = 0;

        while (A < B) {
            A += A * taxaa;
            B += B * taxab;

            ano++;

        }

        System.out.println("Vai demorar " + ano + " anos ate a cidade A ultrapassar a B");

        scanner.close();
    }
}
