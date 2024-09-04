public class Conta {
    private String name;
    private int cpf;
    private int NumeroConta;
    private double saldo;

    //GET
    public String getName(){
        return this.name;
    }
    public int getCpf(){
        return this.cpf;
    }
    public int getNumeroConta(){
        return this.NumeroConta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    //SET
    public void setName(String x){
        this.name = x;
    }
    public void setCpf(int x){
        this.cpf = x;
    }
    public void setNumeroConta(int x){
        this.NumeroConta = x;
    }
    public void setSaldo(double x){
        this.saldo = x;
    }
    
    public void depositar(double x){
        this.saldo += x;
    }
    public void sacar(double x){
        this.saldo -= x;
        System.out.printf("Foram sacados R$:%.2f", x, " o Saldo atual é de R$%2.f ", this.saldo);
    }
}
