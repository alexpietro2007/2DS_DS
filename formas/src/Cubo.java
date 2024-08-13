public class Cubo extends Quadrado {
    @Override
    public void calcular(){
        super.setResul(Math.pow(super.getLargura(), 3));
    };

    @Override
    public String forma(){
        return "Largura: " + super.getLargura() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
    
}
