
public class Serie extends Conteudo{
    private int numEpisodios;
    private int quantTemporada;

    //GET
    public int getNumEpisodios(){
        return this.numEpisodios;
    }

    public int getQuantTemporada(){
        return this.quantTemporada;
    }

    //SET

    public void setNumEpisodios(int x){
        this.numEpisodios = x;
    }

    public void setQuantTemporada(int x){
        this.quantTemporada = x;
    }

    public Serie(String t, int d, int nE, int qT){
        super.setTitulo(t);
        super.setDuracao(d);
        this.numEpisodios = nE;
        this.quantTemporada = qT;
    }
    @Override
    public String toString() {
        return "Série: " + super.getTitulo() + ", Duração: " + super.getDuracao() + " minutos, Episódios: " + this.numEpisodios + ", Temporadas: " + this.quantTemporada;
    }
}
