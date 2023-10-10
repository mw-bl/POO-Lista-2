import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();
        
        System.out.print("Escolha a operação que deseja para a tabuada: ");
        System.out.println("\n1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - MULTIPLICAÇÃO");
        System.out.println("4 - DIVISÃO");

        int operacao = scanner.nextInt();

        if(operacao == 1){
            System.out.println("Tabuada de Adição para " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero + i;
                System.out.println(numero + " + " + i + " = " + resultado);
            }
        } else if (operacao == 2) {
            System.out.println("Tabuada de Subtração para " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero - i;
                System.out.println(numero + " - " + i + " = " + resultado);
            }
        } else if (operacao == 3){
            System.out.println("Tabuada de Multiplicação para " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else if (operacao == 4){
            System.out.println("Tabuada de Divisão para " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                float resultado = numero / i;
                System.out.println(numero + " / " + i + " = " + resultado);
            }
        } else {
            System.out.println("Operação invalida");
        }

        }
    
       
    }
