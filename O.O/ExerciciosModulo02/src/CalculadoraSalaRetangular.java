public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.printf("A área da Sala é de %.2f m² \n", area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = (altura * 2) + (largura * 2);
        System.out.printf("O perímetro da Sala é de %.2f m", perimetro);
    }
}
