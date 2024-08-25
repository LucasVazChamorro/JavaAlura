import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int positivoNegativo = scanner.nextInt();

        if (positivoNegativo >= 0) {
            System.out.println("Você inseriu um número positivo");
        } else {
            System.out.println("Você inseriu um número negativo");
        }
    }
}
