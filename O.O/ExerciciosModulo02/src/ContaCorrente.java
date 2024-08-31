public class ContaCorrente extends ContaBancaria{
    double tarifaMesal;

    public void cobrarTarifaMensal(){
        saldo -= tarifaMesal;
        System.out.println("Tarifa mensal de R$ " + tarifaMesal + " cobrada. \n Saldo atualizado: R$ " + saldo);
    }
}
