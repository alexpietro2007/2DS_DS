public class Octaedro extends Losango{
    @Override
    public void calcular(){
        super.setResul((((super.getComprimento()*super.getLargura())*super.getAltura())/2)*2);
    };

    @Override
    public String forma(){
        return "Base: " + super.getLargura() + " Altura: " + super.getAltura() + "Área: " + super.getResul();
    };
}