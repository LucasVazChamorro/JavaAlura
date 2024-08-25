public class Dolar {
    public static void main(String[] args) {
        double valorEmDolares = 100;
        double conversaoRealDolar = 4.94;

        double custoReais = valorEmDolares * conversaoRealDolar;

        System.out.printf("A mercadoria custa $ %.2f, o Dóllar está $ %.2f, portanto o total em reais é de R$ %.2f", valorEmDolares, conversaoRealDolar, custoReais);

    }
}
