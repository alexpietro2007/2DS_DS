public class ContaCorrente extends ContaGenerica {
    private double chequeEspecial;

    //getters
    public double getChequeEspecial(){
        return this.chequeEspecial;
    }

    //setter
    public void setChequeEspecial(double cH){
        this.chequeEspecial = ch;
    }

    //SobreEscrita
    @Override
    public String sacar(double sV){
        if (super.getSaldo() - sV > 0){
            super.setSaldo(super.getSaldo - sV);
            return "Valor Restante do Saldo Atual: " +super.getSaldo();
        }else if (this.chequeEspecial - sV < 0){
            chequeEspecial -= sV;
            return "valor Restante do Cheque Especial: " + chequeEspecial;
        }else{
            return "Não Foi Possivel Sacar o Valor Desejado Pois já foi utilizado todo seu saldo especial";
        }
    }
}