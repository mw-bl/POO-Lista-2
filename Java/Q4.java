import java.util.Scanner;

public class ConversorDolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Digite a cotação do dólar atual: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacaoDolar;

        System.out.println("O valor em reais é: " + valorReal);
    }
}
