import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        double taxaa;
        int B;
        double taxab;

        do {
            int ano = 0;
            
            System.out.println("Informe o total da população do país A:");
            A = scanner.nextInt();
            System.out.println("Agora informe a taxa de crescimento do país A:");
            
            taxaa = scanner.nextDouble();
            System.out.println();
            System.out.println("Informe agora o total da população do país B:");
            
            B = scanner.nextInt();
            System.out.println("Agora informe a taxa de crescimento do país B:");
            taxab = scanner.nextDouble();
            
            do {
                if (A > B) {
                    System.out.println("O país A não vai ultrapassar o B");
                    break;
             
                }
                while (A < B) {
                    A += (int) (A * taxaa);
                    B += (int) (B * taxab);
                    ano++;
                }
               
                System.out.println("O país A vai ultrapassar o país B em " + ano + " anos.");
            
            } while (A < B);
            
            System.out.println("Deseja repetir a operação? (Digite 's' para sim ou qualquer outra tecla para sair)");

        } while (scanner.next().charAt(0) == 's');
        
        
        
        scanner.close();
    }
}
