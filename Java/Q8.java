import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        double diariaNormal;
        double diariaPromocao;
        double valorSemPromocao;
        double valorComPromocao;
        double lucroPrejuizo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a diária normal: ");
        diariaNormal = scanner.nextDouble();

        diariaPromocao = diariaNormal * (1 - 0.22);
        valorSemPromocao = diariaNormal * 0.4 * 42 * 30;
        valorComPromocao = diariaPromocao * 0.7 * 42 * 30;
        lucroPrejuizo = valorComPromocao - valorSemPromocao;

        System.out.println("\nO valor da diária no período da promoção é: " + diariaPromocao);
        System.out.println("O valor médio arrecadado sem a promoção, durante um mês, é: " + valorSemPromocao);
        System.out.println("O valor médio arrecadado com a promoção, durante um mês, é: " + valorComPromocao);
        System.out.println("O lucro ou prejuízo mensal com a promoção é: " + lucroPrejuizo);
    }
}
