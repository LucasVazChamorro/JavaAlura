public class ConversorMoeda implements ConversaoFinanceira {
    double dolar;
    private double reais = 5.6;

    @Override
    public void converterDolarParaReal() {
        double totalReal = dolar * reais;
        System.out.printf("O total da compra em reais custa R$ %.2f", totalReal);
    }
}


// Outra forma de se fazer:
// Classe ConversorMoeda implementando ConversaoFinanceira
//public class ConversorMoeda implements ConversaoFinanceira {
//    @Override
//    public void converterDolarParaReal(double valorDolar) {
//        double cotacaoDolar = 4.80;
//        double valorReal = valorDolar * cotacaoDolar;
//        System.out.println("O valor em reais é: R$" + valorReal);
//    }
//}