public class ContaPoupanca extends Conta{
    private double percentualDeRendimento = 0.01;

    public void atualizarSaldo(){
        super.setSaldo(super.getSaldo() * percentualDeRendimento);
    }
}