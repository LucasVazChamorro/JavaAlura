public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    void calcularAno(){
       int idade = 2024 - ano;
        System.out.println("O carro tem " + idade + " anos");
    }
}
