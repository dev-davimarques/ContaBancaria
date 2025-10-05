package utils;

public class ContaBancaria {

    private String cliente;
    private int numConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String cliente, int numConta, double saldo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // Getters
    public String getCliente() { return cliente; }
    public int getNumConta() { return numConta; }
    public double getSaldo() { return saldo; }

    // Metodos principais
    public void sacar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor do saque deve ser positivo");
        }
        if (valor > saldo){
            throw new IllegalStateException("Saldo insuficiente para valor: "+valor);
        }
        this.saldo -= valor;
    }

    public void depositar(double valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor de deposito deve ser positivo");
        }
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s | Conta: %d | Saldo: %.2f",cliente, numConta, saldo);
    }
    

}
