import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.printf("%d é maior que %d", n1, n2);
        } else if (n2 > n1) {
            System.out.printf("%d é maior que %d", n2, n1);
        } else {
            System.out.printf("%d e %d são iguais", n1, n2);
        }
    }
}
