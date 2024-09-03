public class Octaedro extends Losango{
    @Override
    public void calcular(){
        super.setResul((Math.pow(super.getLargura(), 2)*super.getAltura()/2)*2);
    };

    @Override
    public String forma(){
        return "Base: " + super.getLargura() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
}