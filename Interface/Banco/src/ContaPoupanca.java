public class ContaPoupanca extends ContaGenerica {
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(double saldoInicial, double taxaRendimento) {
        super(saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    // Getters e Setters
    public void setTaxaRendimento(double taxa) {
        this.taxaRendimento = taxa;
    }

    public double getTaxaRendimento() {
        return this.taxaRendimento;
    }

    // Aplica o rendimento mensal
    public void aplicarRendimentoMensal() {
        double rendimento = super.getSaldo() * (this.taxaRendimento / 100);
        super.setSaldo(super.getSaldo() + rendimento);
    }

    @Override
    public String verificarSaldo() {
        return "Seu saldo atual é de: " + super.verificarSaldo();
    }
}
