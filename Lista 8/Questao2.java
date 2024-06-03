import java.util.Scanner;
public class Quest02 {

    public static void imprirTriangulo(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int vezes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de vezes:");
        vezes = scanner.nextInt();
        System.out.println();

        imprirTriangulo(vezes);

        scanner.close();
    }

}
