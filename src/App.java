import java.util.Locale;

import utils.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

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
