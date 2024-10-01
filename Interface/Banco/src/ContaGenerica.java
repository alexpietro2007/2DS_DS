import java.util.Locale;
import java.text.NumberFormat;

public class ContaGenerica implements Conta {
    private String nome;
    private String cpf;
    private double saldo;
    private int numeroConta;
    Locale localeBr = new Locale("pt", "BR");
    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBr);

    //Constructor
    public void ContaGenerica(double sI){
        this.saldo = sI;
    }

    // getters
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

    // setters
    public void setNome(String n) {
        this.nome = n;
    }

    public void setCpf(String c) {
        this.cpf = c;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public void setNumeroConta(int nc) {
        this.numeroConta = nc;
    }

    @Override
    public String depositar(double dv) {
        this.saldo += dv;
        return "Seu saldo agora é de: " + dinheiro.format(this.saldo);
    }

    @Override
    public String sacar(double sv) {
        if (sv > this.saldo) {
            return "Saldo insuficiente!";
        } else {
            this.saldo -= sv;
            return "Seu saldo agora é de: " + dinheiro.format(this.saldo);
        }
    }

    @Override
    public String verificarSaldo(){
        return "Seu saldo atual é de: "+ dinheiro.format(this.saldo);
    }
}
