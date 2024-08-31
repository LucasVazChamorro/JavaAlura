public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvalicao;
    int numAvaliacoes;


    void exibirFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliar(double nota){
        somaAvalicao += nota;
        numAvaliacoes++;
    }

    double calcularMediaAvaliacoes(){
        return somaAvalicao / numAvaliacoes;
    }
}
