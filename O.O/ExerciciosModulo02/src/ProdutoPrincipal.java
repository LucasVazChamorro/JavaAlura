public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Desktop Toshiba");
        produto1.setPreco(2000);

        produto1.aplicarDesconto(10);
    }
}
