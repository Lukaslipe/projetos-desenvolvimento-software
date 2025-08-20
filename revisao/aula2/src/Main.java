public class Main {
    public static void main(String[] args) {

        Cachorro nino = new Cachorro();
        nino.emitirSom();

        Gato zeus = new Gato();
        zeus.emitirSom();

        Passaro carla = new Passaro();
        carla.emitirSom();

        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.setSaldo(1000);
        minhaConta.setLimite(200);
        minhaConta.sacar(1000);

        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(4);
        retangulo.setBase(2);
        retangulo.calcularArea();

        Circulo circulo = new Circulo();
        circulo.setRaio(12);
        circulo.calcularArea();

        Quadrado quadrado = new Quadrado();
        quadrado.setLado(8);
        quadrado.calcularArea();
    }
}