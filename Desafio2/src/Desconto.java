public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 150;
        double percentualDesconto = 0.1;

        double valorFinal = precoOriginal - (precoOriginal * percentualDesconto);

        System.out.println("O preço final é de R$ " + valorFinal);
    }
}
