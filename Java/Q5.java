import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        int anos;
        int meses;
        int dias;

        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Informe sua idade em anos: ");
        anos = scanner.nextInt();
      
        System.out.println("Informe a quantidade de meses desde seu aniversário: ");
        meses = scanner.nextInt();
      
        System.out.println("Informe a quantidade de dias desde seu aniversário: ");
        dias = scanner.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("Idade expressa em dias: " + idadeEmDias);
        System.out.println("O usuário tem " + anos + " anos, "+ meses + " meses" + " e " + dias + " dias de idade.");
    }
}
