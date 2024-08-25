import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (number != 3) {
            System.out.println("""
                Digite sua opção:
                [ 1 ] - Calcular área do quadrado;
                [ 2 ] - Calcular área do círculo;
                [ 3 ] - Sair""");
            number = scanner.nextInt();

            if (number == 1) {
                System.out.println("Informe o lado do quadrado em metros: ");
                double lado = scanner.nextDouble();
                double area = lado * lado;
                System.out.printf("A área do quadrado é de %.2f m² \n", area);
            } else if (number == 2) {
                System.out.println("Informe o raio do círculo: ");
                double raio = scanner.nextDouble();
                double area = 3.14 * (raio * raio);
                System.out.printf("A área do círculo é de %.2f m² \n", area);
            } else if (number != 3) {
                System.out.println("Opção inválida, por favor, tente novamente!\n");
            }
        }
    }
}
