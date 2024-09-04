
import java.util.Scanner;

public class main {
    public static void main(String[] args){
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

        ContaPoupanca cp1 = new ContaPoupanca();
        System.out.println("Qual o nome da Conta Corrente?");
        cp1.setName(in.next());
        System.out.println("Qual o cpf da Conta Corrente?");
        cp1.setCpf(in.nextInt());
        System.out.println("Qual o Numero da Conta Corrente?");
        cp1.setNumeroConta(in.nextInt());
        System.out.println("Qual o saldo da Conta Corrente?");
        cp1.setSaldo(in.nextDouble());
        in.close();
    }
}
