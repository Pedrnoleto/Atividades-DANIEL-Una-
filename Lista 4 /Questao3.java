/* Faça um programa que leia e valide as seguintes informações: 
Nome: maior que 3 caracteres; 
Idade: entre 0 e 150; 
Salário: maior que zero; 
Sexo: 'f' ou 'm'; 
Estado Civil: 's', 'c', 'v', 'd';  */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        char sexo, estado;

        do {
            System.out.println("Digite seu nome completo : ");
            nome = scanner.nextLine();
        } while (nome.length() < 3);

        int idade;
        do {

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        double salario;

        do {
            System.out.println("Digite seu salário: ");
            salario = scanner.nextDouble();

        } while (salario <= 0);

        do {
            System.out.println("Digite seu sex, se for Masculino (m) e se for Feminino (f): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'm' && sexo != 'f');

        do {
            System.out.println(
                    "Digite seu estado civil: 's' para Solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado");
            estado = scanner.next().charAt(0);

        } while (estado != 's' && estado != 'c' && estado != 'v' && estado != 'd');

        scanner.close();
        System.out.println("   \n   ");
        System.out.println("Informações válidas foram inseridas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estado);
    }
}
