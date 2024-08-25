import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numUser = scanner.nextInt();

        if (numUser % 2 == 0) {
            System.out.println("O número escolhido é par");
        } else {
            System.out.println("O número escolhido é ímpar");
        }

    }
}
