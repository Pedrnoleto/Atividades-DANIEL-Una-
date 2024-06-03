import java.util.Scanner;
public class Quest04 {

    public static char posNeg(int num){
        if(num>0){
            return 'P';
        }
        else{
            return 'N';
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        char retNum;

        System.out.println("Digite o número");
        num = scanner.nextInt();
        
        retNum = posNeg(num);

        System.out.println("O seu número é: " + retNum);

        scanner.close();
    }

}
