public class ContaCorrente extends ContaBancaria{
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        double saldo = getSaldo();
        double saldoDisponivel = saldo + limite;

        if (valor > 0 && valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado");
            System.out.println("Saldo disponível: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente (incluindo limite).");
        }
    }
}
