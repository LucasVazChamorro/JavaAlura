public class Conta {
    private String numeroConta;
    private double saldo;
    public String titular;

    void imprimeInfo(){
        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
