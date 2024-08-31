public class ContaPrincipal {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.titular = "Pedro";
        conta1.setNumeroConta("3785");
        conta1.setSaldo(40000.00);

        conta1.imprimeInfo();
    }
}
