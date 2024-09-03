public class Paralelepipedo extends Retangulo{
    @Override
    public void calcular(){
        super.setResul(super.getAltura() * super.getLargura()*super.getComprimento());
    };

    @Override
    public String forma(){
        return "Largura: " + super.getLargura() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
    
}
