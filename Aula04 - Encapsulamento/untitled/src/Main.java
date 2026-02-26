import entidades.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("cleiton arrasta", 500);

        conta.setTitular("leon kenedy");
        conta.saldo = 20000;

        System.out.println(conta.getTitular());
        System.out.println(conta.saldo());
    }
}
