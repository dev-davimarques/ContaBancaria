package utils;

public class ContaCorrente extends ContaBancaria{
    private double limite;

    // Construtor
    public ContaCorrente(String cliente, int numConta, double saldo, double limite){
        super(cliente, numConta, saldo);
        setLimite(limite);
    }

    // Getters e Setters
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        if (limite < 0){
            throw new IllegalArgumentException("O limite não pode ser negativo.");
        }
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0){
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        if (valor > (saldo + limite)) {
            throw new IllegalArgumentException("Limite insuficiente");
        } else {
            saldo-=valor;
        }
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s | Conta: %d | Saldo Inicial: %.2f | Limite: %.2f",getCliente(), getNumConta(), saldo, limite);
    }
}
