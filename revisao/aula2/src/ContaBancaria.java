public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        } else {
            System.out.println("O valor de deposito deve ser maior do que zero.");
        }
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        } else {
            System.out.println("Você não tem saldo suficiente.");
        }
    }
}
