public class Circulo extends  FiguraGeometrica{
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = (3.14 * raio * raio);
        System.out.println("A área do círculo é: " + area);
    }
}
