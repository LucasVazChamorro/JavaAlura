public class Musicas extends Audio implements Programa {
    private String banda;
    private String album;

    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.banda = "Metallica";
        musica.album = "...And Justice For All";
        musica.setTitulo("Blackened");
        musica.setDuracao("6m42s");
        musica.setClassificacao(5);
        musica.ExibirFichaTecnica();
        musica.Reproduzir();
        musica.Curir();
    }

    @Override
    public void Reproduzir() {
        System.out.println("Você está reproduzindo a música " + getTitulo() + ", banda " + banda);
    }

    @Override
    public void Curir() {
        System.out.println("Você curtiu esta música!");
    }

    @Override
    public void ExibirFichaTecnica() {
        System.out.println("Banda: " + banda);
        System.out.println("Album: " + album);
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao());
        System.out.println("Total de Reproduções: " + getTotalReproducoes());
        System.out.println("Total de Curtidas: " + getTotalCurtidas());
        System.out.println("Total de Estrelas: " + getClassificacao());
    }
}