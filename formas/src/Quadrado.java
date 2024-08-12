public class Quadrado extends Forma {
    @Override
    public void calcular(){
        super.setResul(super.getAltura() * super.getLargura());
    };

    @Override
    public String forma(){
        return "Largura: " + super.getLargura() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
}
