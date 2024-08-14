public class PrismaPentagonal extends Pentagono{
    @Override
    public void calcular(){
        super.setResul(super.getAltura() * super.getLado()*super.getComprimento());
    };

    @Override
    public String forma(){
        return "Lado: " + getLado() + " Altura: " + super.getAltura()+ " Comprimento: "+ super.getComprimento() + "Área: " + super.getResul();
    };
}
