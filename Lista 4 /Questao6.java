/* Faça um programa que imprima na tela os números de 1 a 20, um abaixo do 
outro. Depois modifique o programa para que ele mostre os números um ao 
lado do outro. */



import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;

        System.out.println("Números imprimidos de cima para baixo: ");
        for (a = 1; a <= 20; a++) {
            System.out.println(a);
        }

        System.out.println("Números imprimidos lateralmente: ");
        for (a = 1; a <= 20; a++) {
            System.out.print(a + " ");

        }

        scanner.close();
    }
}
