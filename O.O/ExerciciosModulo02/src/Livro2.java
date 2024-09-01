public class Livro2 extends Produto implements Calculavel{
    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }
}
