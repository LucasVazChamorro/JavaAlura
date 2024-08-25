import org.w3c.dom.ls.LSOutput;

public class Casting {
    public static void main(String[] args) {
        double n1 = 7.8;
        int n2 = 10;

        int soma = (int) n1 + n2;

        System.out.printf("A soma entre o casting de %.1f e %d é de %d.", n1, n2, soma);
    }
}
