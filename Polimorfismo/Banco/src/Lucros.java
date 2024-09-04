public class Lucros {
    private double soma;

    //GET
    public double getSoma(){
        return  this.soma;
    }

    public void registra(Conta c){
        soma += c.getSaldo();
    }

}
