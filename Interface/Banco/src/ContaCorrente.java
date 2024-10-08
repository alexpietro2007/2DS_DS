import java.text.DecimalFormat;

public class ContaCorrente extends ContaGenerica {
    private double chequeEspecial;
    DecimalFormat dinheiro = new DecimalFormat("R$ #,##0.00");

    // Construtor
    public ContaCorrente(double saldoInicial, double chequeEspecial) {
        super(saldoInicial);
        this.chequeEspecial = chequeEspecial;
    }

    // Getters e Setters
    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    // Implementação dos métodos da interface
    @Override
    public String depositar(double valor) {
        super.setSaldo(super.getSaldo() + valor);
        return "Depósito efetuado. Seu saldo agora é de: " + dinheiro.format(this.getSaldo());
    }

    @Override
    public String sacar(double valor) {
        double saldoAtual = super.getSaldo();

        if (valor <= saldoAtual) {
            super.setSaldo(saldoAtual - valor);
            return "Saque efetuado. Seu saldo agora é de: " + dinheiro.format(this.getSaldo());
        }

        double valorRestante = valor - saldoAtual;
        if (valorRestante <= this.chequeEspecial) {
            super.setSaldo(0);
            this.chequeEspecial -= valorRestante;
            return "Saque efetuado utilizando cheque especial. Saldo atual: "
                    + dinheiro.format(super.getSaldo()) + ", Cheque especial restante: "
                    + dinheiro.format(this.chequeEspecial);
        }

        return "Saldo insuficiente, mesmo com o cheque especial.";
    }

    @Override
    public String verificarSaldo() {
        return "Seu saldo atual é: " + dinheiro.format(super.getSaldo())
                + " e o saldo do cheque especial é: " + dinheiro.format(this.chequeEspecial);
    }
}

