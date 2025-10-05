package utils;

public class ContaPoupanca extends ContaBancaria{

    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(String cliente, int numConta, double saldo){
        super(cliente, numConta, saldo);
    }
    public ContaPoupanca(String cliente, int numConta, double saldo, double taxaRendimento){
        super(cliente, numConta, saldo);
        if (taxaRendimento < 0){
            throw new IllegalArgumentException("A taxa de rendimento não pode ser negativa");
        }
        this.taxaRendimento = taxaRendimento;
    }
    

    // Getters e Setters
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        if (taxaRendimento < 0){
            throw new IllegalArgumentException("A taxa não pode ser negativa.");
        }
        this.taxaRendimento = taxaRendimento;
    }

    // Metodos principais
    public void calcularNovoSaldo(){
        saldo *= (1 + taxaRendimento / 100);
    }

    @Override
    public String toString() {
        return String.format("Cliente: %s | Conta: %d | Saldo Inicial: %.2f | Taxa de Rendimento: %.2f%%",getCliente(), getNumConta(), saldo, taxaRendimento);
    }

}
