public class main {
    public static void main(String[] args) {
        // Criação de uma Conta Corrente com saldo inicial de 1000 e cheque especial de 500
        ContaCorrente cc = new ContaCorrente(1000, 500);
        System.out.println(cc.depositar(300));  // Depósito
        System.out.println(cc.sacar(1500));    // Saque utilizando cheque especial
        System.out.println(cc.verificarSaldo());

        // Criação de uma Conta Poupança com saldo inicial de 2000 e taxa de rendimento de 1.5%
        ContaPoupanca cp = new ContaPoupanca(2000, 1.5);
        cp.aplicarRendimentoMensal();  // Aplica o rendimento
        System.out.println(cp.verificarSaldo());
    }
}
