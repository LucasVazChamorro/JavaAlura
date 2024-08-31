public class ModeloCarro extends Carro2 {
    public static void main(String[] args) {
        Carro2 corolla = new Carro2();
        corolla.definirModelo("Sedan");
        corolla.definirPrecos(150000,130000,100000);
        corolla.exibirInfo();
    }
}
