import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de três dígitos: ");
        int numero = scanner.nextInt();

        int valorOriginal = numero;
        int numeroInvertido = 0;
        
        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + numero % 10;
            numero = numero / 10;
        }
        
        System.out.println("\nO valor original é: " + valorOriginal);
        System.out.println("O valor invertido é: " + numeroInvertido);

    }
}
