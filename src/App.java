import utils.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria("Davi", 100, 1000);
        System.out.println(c1.toString());
        c1.sacar(1100);
    }
}
