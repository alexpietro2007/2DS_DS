public class Piramide extends Triangulo{ 
    @Override
    public void calcular(){
        super.setResul(((super.getLargura()*super.getLargura())*super.getAltura())/2);
    };

    @Override
    public String forma(){
        return "Base: " + super.getLargura() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
}
