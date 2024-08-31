public class CarroPrincipal {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Picape";
        carro1.ano = 2014;
        carro1.cor = "Azul";

        carro1.exibirFichaTecnica();

        carro1.calcularAno();
    }
}
