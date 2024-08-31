public class ContaCorrenteUsuario {
    public static void main(String[] args) {
        ContaCorrente nubank = new ContaCorrente();
        nubank.depositar(5000);
        nubank.tarifaMesal = 50;
        nubank.cobrarTarifaMensal();
        nubank.sacar(200);
        nubank.consultarSaldo();

    }
}
