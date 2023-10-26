import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        int segundos;
        int horas;
        int minutos;
        int segundosRestantes;

        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Informe a duração do evento em segundos: ");
        segundos = scanner.nextInt();

        horas = segundos / 3600;
        segundosRestantes = segundos % 3600;
        minutos = segundosRestantes / 60;
        segundos = segundosRestantes % 60;

        System.out.println("Duração do evento: " + horas + ":" + minutos + ":" + segundos);
    }
}
