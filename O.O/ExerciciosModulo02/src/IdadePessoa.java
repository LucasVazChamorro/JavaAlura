public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    void verificarIdade(){
        if (idade >= 18){
            System.out.printf("%s possui a maioridade!", nome);
        } else {
            System.out.printf("%s é menor de idade", nome);
        }
    }
}
