public class ContaCorrente extends Conta {
    private double tafifaMensal;

    //GET
    public double getTarifaMensal(){
        return this.tafifaMensal;
    }
    //SET
    public void setTarifaMensal(double x){
        this.tafifaMensal = x/100;
    }

    public void cobrar(){
        super.setSaldo(super.getSaldo() - (super.getSaldo() * tafifaMensal));
    }
}
