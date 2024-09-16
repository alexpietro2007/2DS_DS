
public class Conteudo {

    private String titulo;
    private String categoria;
    private int duracao;

    //GET
    public int getDuracao() {
        return this.duracao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getCategoria() {
        return this.categoria;
    }

    //SET
    public void setTitulo(String x) {
        this.titulo = x;
    }

    public void setCategoria(String x) {
        this.categoria = x;
    }

    public void setDuracao(int x) {
        this.duracao = x;
    }

    public String descricao() {
        return "titulo: " + this.titulo + "categoria: " + this.categoria;
    }

    public String toString(){
        return "err";
    }
}
