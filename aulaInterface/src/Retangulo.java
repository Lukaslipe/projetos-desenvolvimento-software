public class Retangulo implements Forma, Imprimivel{

    private double base;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.base) + (2 * this.altura);
    }

    @Override
    public void imprimir() {
        System.out.println("Eu sou um retângulo, e essa é a minha altura: " + this.altura);
    }
}
