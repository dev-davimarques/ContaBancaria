package utils;

public class ContaBancaria {

    private final String cliente;
    private final int numConta;
    protected double saldo;

    // Construtor
    public ContaBancaria(String cliente, int numConta, double saldo){

        if(cliente == null || cliente.isBlank()){
            throw new IllegalArgumentException("O nome do Cliente não pode ser nulo ou vazio.");
        }
        if (numConta < 0) {
            throw new IllegalArgumentException("O número da conta deve ser positivo.");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }

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
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s | Conta: %d | Saldo Inicial: %.2f",cliente, numConta, saldo);
    }
    

}
