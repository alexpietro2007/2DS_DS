
public class Publicacao {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public void Publicacao(String aut, String titu, int anoPub) {
		this.anoPublicacao = anoPub;
		this.autor = aut;
		this.titulo = titu;
	}
	//get
	public String getTitulo () {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	//Fim_get
	
	//set
	public void setTitulo(String titu) {
		this.titulo = titu;
	}
	public void setAutor(String aut) {
		this.autor = aut;
	}
	public void setAnoPublicacao(int anoPub) {
		this.anoPublicacao = anoPub;
	}
	//Fim_set
	
	public String exibirDetalhes() {
		return "O nome Do Publicação é: " + this.titulo + " Do autor: " + this.autor + " Publicado em: " + this.anoPublicacao;
	}
}
