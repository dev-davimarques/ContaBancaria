import java.util.Locale;

import utils.ContaBancaria;
import utils.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        // ContaBancaria c1 = new ContaBancaria("Davi", 100, 1000);
        // System.out.println(c1.toString());
        // c1.sacar(1100);

        ContaPoupanca c2 = new ContaPoupanca("Cliente 2", 300, 100, 4);
        // Valor 1
        System.out.println(c2.toString());
        c2.calcularNovoSaldo();
        System.out.println("Saldo atual: "+c2.getSaldo());
        
        System.out.println("----");

        c2.setTaxaRendimento(6);
        System.out.println(c2.toString());
        c2.calcularNovoSaldo();
        System.out.printf("Saldo atual: %.2f%n",c2.getSaldo());
    }
}
