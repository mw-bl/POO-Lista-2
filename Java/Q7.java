import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        int valorSaque;
        int notas100;
        int notas50;
        int notas10;
        int notas5;
        int notas1;

        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Informe o valor do saque (valor inteiro): ");
        valorSaque = scanner.nextInt();

        notas100 = valorSaque / 100;
        valorSaque = valorSaque % 100;
        notas50 = valorSaque / 50;
        valorSaque = valorSaque % 50;
        notas10 = valorSaque / 10;
        valorSaque = valorSaque % 10;
        notas5 = valorSaque / 5;
        notas1 = valorSaque % 5;

        System.out.println("O valor do saque pode ser expresso em:");
        System.out.println("   " + notas100 + " notas de 100");
        System.out.println("   " + notas50 + " notas de 50");
        System.out.println("   " + notas10 + " notas de 10");
        System.out.println("   " + notas5 + " notas de 5");
        System.out.println("   " + notas1 + " notas de 1");
    }
}
