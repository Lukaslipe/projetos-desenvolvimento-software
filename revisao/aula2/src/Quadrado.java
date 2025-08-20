public class Quadrado extends FiguraGeometrica{
    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double area = this.lado * this.lado;
        System.out.println("A área do quadrado é: " + area);
    }
}
