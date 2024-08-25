import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite um filme");
        String filme = leitura.nextLine();
        System.out.println("Ano de lançamento");
        int anoLancamento = leitura.nextInt();
        System.out.println("Qual a avaliação? ");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}
