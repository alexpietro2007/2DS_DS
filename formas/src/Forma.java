public abstract class Forma {
    private double altura;
    private double largura;
    private double comprimento;
    private double resul;
    public abstract String forma();
    
    //GET
    public double getAltura(){
        return this.altura;
    };
    public double getLargura(){
        return this.largura;
    };
    public double getComprimento(){
        return this.comprimento;
    };
    public double getResul(){
        return this.resul;
    };

    //SET
    public void setAltura(double x){
        this.altura = x;
    };
    public void setLargura(double x){
        this.largura = x;
    };
    public void setComprimento(double x){
        this.comprimento = x; 
    };
    public void setResul(double x){
        this.resul = x;
    };

    public void calcular(){

    };

    public void apresentar(){
        System.out.println(forma());
    }
}
