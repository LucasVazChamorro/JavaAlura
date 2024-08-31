public class AlunoPrincipal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Kaka", 20,5, 7, 9);
        Aluno aluno2 = new Aluno("Gigica", 50,10, 9, 8);


        aluno1.exibirInformacoes();
        aluno1.calcularMedias();

        aluno2.exibirInformacoes();
        aluno2.calcularMedias();
    }
}
