public class Quadrado extends Forma {
    @Override
    public void calcular(){
        super.setResul(super.getLargura() * super.getLargura());
    };

    @Override
    public String forma(){
        return "Largura: " + super.getLargura() + " Altura: " + super.getLargura() + " Área: " + super.getResul();
    };

}
