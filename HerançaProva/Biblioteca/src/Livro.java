
public class Livro extends Publicacao {
	private int numPaginas;
	private String editora;
	
	public void Livro(String titu, String aut, int anoPub, int numPag, String edit) {
		super.setAnoPublicacao(anoPub);
		super.setAutor(aut);
		super.setTitulo(titu);
		this.numPaginas = numPag;
		this.editora = edit;
	}
	//get
	public int getNumPaginas(){
		return this.numPaginas;
	}
	public String getEditora() {
		return this.editora;
	}
	//Fim_get
	
	//set
	public void setNumPaginas(int numPag) {
		this.numPaginas = numPag;
	}
	public void setEditora(String edit) {
		this.editora = edit;
	}
	//Fim_set
	
	@Override
	public String exibirDetalhes() {
		return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado em: " + super.getAnoPublicacao() + " Com: "+ this.numPaginas + " Paginas e da Editora: "+ this.editora;
	}
	
	public String exibirDetalhes(boolean edit) {
		if(edit) {
			return	"O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado em: " + super.getAnoPublicacao() + " Com: "+ this.numPaginas + " Paginas e a Editora é: " + this.editora;
		}else {
			return 	"O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado em: " + super.getAnoPublicacao() + " Com: "+ this.numPaginas + " Paginas";
		}
	}
}
