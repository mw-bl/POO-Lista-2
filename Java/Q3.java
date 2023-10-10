import java.util.Scanner;

public class Q3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        float distPercorrida;
        float litrosUsados;

        System.out.print("Digite o tempo gasto na viagem: ");
        float tempoGasto = scanner.nextFloat();

        System.out.print("Digite a velocidade media durante a viagem: ");
        float velocMedia = scanner.nextFloat();
        
        distPercorrida = tempoGasto * velocMedia;
        System.out.println("A distancia percorrida na viagem foi: " + distPercorrida);

        litrosUsados = distPercorrida / 12;
        System.out.println("A quantidade de litros usados na viagem foi: " + litrosUsados);
    }
}
