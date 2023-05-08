public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João da Silva", "123.456.789-00");
        Conta conta1 = new Conta(1, "Conta Corrente", 1000.00);
        Conta conta2 = new Conta(2, "Conta Poupança", 5000.00);
        cliente1.adicionarConta(conta1);
        cliente1.adicionarConta(conta2);

        System.out.println("Saldo da conta 1: " + conta1.consultarSaldo());
        System.out.println("Saldo da conta 2: " + conta2.consultarSaldo());

        conta1.depositar(500.00);
        conta2.sacar(1000.00);

        System.out.println("Saldo da conta 1 após depósito: " + conta1.consultarSaldo());
        System.out.println("Saldo da conta 2 após saque: " + conta2.consultarSaldo());

        ArrayList<Conta> contasCliente1 = cliente1.listarContas();
        for (Conta conta : contasCliente1) {
            System.out.println("Conta " + conta.getNumero() + " - " + conta.getTipoConta() + " - Saldo: " + conta.consultarSaldo());
        }
    }
}