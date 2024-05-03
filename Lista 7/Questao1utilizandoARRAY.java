import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double soma = 0;
        double mediaAnual = soma / 12;

        List<Double> temp = new ArrayList<Double>();
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro" };

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i]);
            temperatura = scanner.nextDouble();
            temp.add(temperatura);
        }
        for (double tempe : temp) {
            soma += tempe;
        }

        System.out.printf("Contando que a media anual foi %2.f, esses foram os meses que ficaram acima dela\n");
        for (int i = 0; i < 12; i++) {
            temperatura = temp.get(i);
            if (temperatura > mediaAnual) {
                System.out.println(meses[i] + ": " + temperatura + "°C");
            }
            scanner.close();
        }
    }
}
