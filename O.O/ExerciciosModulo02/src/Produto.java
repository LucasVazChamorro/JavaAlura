public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void aplicarDesconto(double percentual){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        double desconto = preco - (preco * (percentual/100));
        System.out.printf("Preço com desconto R$ %.2f", desconto);
    }
}
