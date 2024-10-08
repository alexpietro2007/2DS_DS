import java.text.NumberFormat;
import java.util.Locale;

public abstract class ContaGenerica implements Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private int numeroConta;
    Locale localeBr = new Locale("pt", "BR");
    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBr);

    // Construtor
    public ContaGenerica(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Getters
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public String depositar(double valor) {
        this.saldo += valor;
        return "Depósito efetuado. Seu saldo agora é de: " + dinheiro.format(this.saldo);
    }

    public String sacar(double valor) {
        if (valor > this.saldo) {
            return "Saldo insuficiente!";
        } else {
            this.saldo -= valor;
            return "Saque efetuado. Seu saldo agora é de: " + dinheiro.format(this.saldo);
        }
    }

    @Override
    public String verificarSaldo() {
        return "Seu saldo atual é de: " + dinheiro.format(this.saldo);
    }
}

