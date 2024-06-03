import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vezes, i, j;

        System.out.println("Digite o valor de n:");
        vezes = scanner.nextInt();
        System.out.println();

        for (i=1; i<=vezes; i++){
            for(j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }   


        scanner.close();
    }   
}
