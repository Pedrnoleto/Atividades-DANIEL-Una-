/* Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o usuário 
informe um valor válido. */


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;
        
        do {
            System.out.println("Escolha uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida, por favor tente novamente...");
            } else {
                System.out.println("SUA NOTA FOI " + nota);
                break; // Sai do loop se uma nota válida for inserida
            }
        } while (true);
        scanner.close();
    }
}
