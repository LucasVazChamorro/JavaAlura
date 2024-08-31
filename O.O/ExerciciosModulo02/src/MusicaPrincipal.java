public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "The Unforgiven";
        musica1.artista = "Metallica";
        musica1.anoLancamento = 1991;

        musica1.exibirFichaTecnica();

        musica1.avaliar(10);
        musica1.avaliar(8);
        musica1.avaliar(5);

        double media = musica1.calcularMediaAvaliacoes();
        System.out.printf("A média é %.2f", media);
    }
}
