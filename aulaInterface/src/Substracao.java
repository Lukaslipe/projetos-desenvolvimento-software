public class Substracao implements OperacaoMatematica{
    @Override
    public double executar(double a, double b) {
        return a - b;
    }

    @Override
    public void descricao() {
        System.out.println("Essa operação substrai um número do outro");
    }
}
