public class Retangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (this.base * this.altura);
        System.out.println("A área do retângulo é: " + area);
    }
}
