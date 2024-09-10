
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Conta c1 = new Conta();
        System.out.println("Qual o nome da Conta");
        c1.setName(in.next());
        System.out.println("Qual o cpf da Conta");
        c1.setCpf(in.nextInt());
        System.out.println("Qual o Numero da Conta");
        c1.setNumeroConta(in.nextInt());
        System.out.println("Qual o saldo da Conta");
        c1.setSaldo(in.nextDouble());

        ContaCorrente cc1 = new ContaCorrente();
        System.out.println("Qual o nome da Conta Corrente?");
        cc1.setName(in.next());
        System.out.println("Qual o cpf da Conta Corrente?");
        cc1.setCpf(in.nextInt());
        System.out.println("Qual o Numero da Conta Corrente?");
        cc1.setNumeroConta(in.nextInt());
        System.out.println("Qual o saldo da Conta Corrente?");
        cc1.setSaldo(in.nextDouble());
        System.out.println("Qual a Tarifa Mensal?");
        cc1.setTarifaMensal(in.nextDouble());

        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println("Qual o nome da Conta Poupança?");
        cp1.setName(in.next());
        System.out.println("Qual o cpf da Conta Poupança?");
        cp1.setCpf(in.nextInt());
        System.out.println("Qual o Numero da Conta Poupança?");
        cp1.setNumeroConta(in.nextInt());
        System.out.println("Qual o saldo da Conta Poupança?");
        cp1.setSaldo(in.nextDouble());

        System.out.println("----------------------------------");
        System.out.println("Informações da Conta:");
        System.out.println("Nome: " + c1.getName());
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Número da Conta: " + c1.getNumeroConta());
        System.out.println("Saldo: " + c1.getSaldo());

        System.out.println("----------------------------------");

        // Exibindo informações da Conta Corrente
        System.out.println("Informações da Conta Corrente:");
        System.out.println("Nome: " + cc1.getName());
        System.out.println("CPF: " + cc1.getCpf());
        System.out.println("Número da Conta: " + cc1.getNumeroConta());
        System.out.println("Saldo: " + cc1.getSaldo());
        System.out.println("Tarifa Mensal: " + cc1.getTarifaMensal());

        System.out.println("----------------------------------");

        // Exibindo informações da Conta Poupança
        System.out.println("Informações da Conta Poupança:");
        System.out.println("Nome: " + cp1.getName());
        System.out.println("CPF: " + cp1.getCpf());
        System.out.println("Número da Conta: " + cp1.getNumeroConta());
        System.out.println("Saldo: " + cp1.getSaldo());
        System.out.println("----------------------------------");

        Lucros l = new Lucros();
        System.out.println("Total Lucro da Contas:");
        System.out.println(l.getSoma());

        in.close();

    }
}
