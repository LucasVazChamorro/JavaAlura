import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja tabular: ");
        int tabular = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(tabular + " * " + i + " = " + (tabular * i));
        }
    }
}
