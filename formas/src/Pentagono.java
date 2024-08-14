public class Pentagono extends Forma{
    private double lado;

    //GET
    public double getLado(){
        return this.lado;
    };

    //SET
    public void setLado(double x){
        this.lado = x;
    };


    @Override
    public void calcular(){
        super.setResul((super.getAltura()/2) * (getLado() * 5);
    };

    @Override
    public String forma(){
        return "Lado: " + getLado() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
}
