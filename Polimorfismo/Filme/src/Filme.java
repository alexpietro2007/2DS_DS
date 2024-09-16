
public class Filme extends Conteudo {
    public Filme (String t, int d){
        super.setTitulo(t);
        super.setDuracao(d);
    }
    @Override
    public String toString() {
        return "Filme: " + super.getTitulo() + ", Duração: " + super.getDuracao() + " minutos";
    }
}
