/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a 
senha igual ao nome do usuário, mostrando uma mensagem de erro e 
voltando a pedir as informações.  */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, senha;

        do {
            System.out.println("Digite seu Usuário : ");
            nome = scanner.nextLine();
            System.out.println("Agora digite sua senha :");
            senha = scanner.nextLine();

            if (nome.equals(senha)) {
                System.out.println("Senha não pode ser o nome do usuário... \n Tente outra senha.");

            } else {
                System.out.print("Login completado com sucecsso");
                System.out.println(" ");

                break;
            }

        } while (true);
        scanner.close();
    }

}
