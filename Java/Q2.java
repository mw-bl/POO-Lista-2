import java.util.Scanner;

public class Q2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura que quer converter: ");
        double C = scanner.nextInt();
        double F;

        F = (9 * C + 160) / 5;

        System.out.println("A temperatua em Celsius: " + C + "°C");
        System.out.println("Temperatura em Fahrenheit: " + F + "°F");
    }
}
