public class Podcast extends Audio implements Programa {
    private String podcast;

    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        podcast.podcast = "Hipsters Ponto Tech";
        podcast.setTitulo("Inteligência Artificial com Guanabara - Hipsters Ponto Tech #426");
        podcast.setDuracao("59m11s");
        podcast.setClassificacao(5);
        podcast.setTotalCurtidas(50777);
        podcast.setTotalReproducoes(51489);
        podcast.ExibirFichaTecnica();
        podcast.Reproduzir();
        podcast.Curir();
    }

    @Override
    public void Reproduzir() {
        System.out.println("Você está reproduzindo o podcast " + podcast + "!");
    }

    @Override
    public void Curir() {
        System.out.println("Você curtiu este podcast!");
    }

    @Override
    public void ExibirFichaTecnica() {
        System.out.println("Podcast " + podcast);
        System.out.println("Título " + getTitulo());
        System.out.println("Duração " + getDuracao());
        System.out.println("Total de Reproduções " + getTotalReproducoes());
        System.out.println("Total de Curtidas " + getTotalCurtidas());
        System.out.println("Total de Estrelas " + getClassificacao());
    }
}