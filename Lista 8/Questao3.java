import java.util.Scanner;
public class Quest03 {
    public static int somaNum (int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n1, n2, n3, soma;

        System.out.println("Digite o valor do número 1: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o valor do número 2: ");
        n2 = scanner.nextInt();
        System.out.println("Digite o valor do número 3: ");
        n3 = scanner.nextInt();

        soma = somaNum(n1, n2, n3);

        System.out.printf("A soma de %d + %d + %d é: %d", n1, n2, n3, soma);

        
        scanner.close();
    }
    
}
