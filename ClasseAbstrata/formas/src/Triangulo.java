public class Triangulo extends Forma { 
    @Override
    public void calcular(){
        super.setResul((super.getAltura() * super.getLargura())/2);
    };

    @Override
    public String forma(){
        return "Base: " + super.getLargura() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
}
