package utils;

public class ContaPoupanca extends ContaBancaria{

    private double taxaRendimento;

    public ContaPoupanca(String cliente, int numConta, double saldo, double taxaRendimento){
        super(cliente, numConta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public void calcularNovoSaldo(double taxa){
        double rendimento = getSaldo() * taxaRendimento;

    }
}
