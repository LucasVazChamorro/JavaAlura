import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número a ser fatorado: ");
        int numero = scanner.nextInt();

        int resultado = 1;

        for (int i = 1; i <= numero; i++){
            resultado *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }
}
