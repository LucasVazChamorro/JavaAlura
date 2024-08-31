public class ContaBancaria {
    protected double saldo;


    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$ " + valor +"\n" +
                "Saldo atual é de R$ " + saldo);
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo inferior");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " efetuado! \n" +
                    "Saldo atual R$ " + saldo);
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
