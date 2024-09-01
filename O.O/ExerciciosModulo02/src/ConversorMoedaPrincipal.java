public class ConversorMoedaPrincipal {
    public static void main(String[] args) {
        ConversorMoeda desktop = new ConversorMoeda();
        desktop.dolar = 300;

        desktop.converterDolarParaReal();
    }
}


// Outra forma de se fazer:
// public class TesteConversorMoeda {
//    public static void main(String[] args) {
//        ConversorMoeda conversor = new ConversorMoeda();
//        conversor.converterDolarParaReal(50); // Exemplo com o valor em dólar
//    }
//}