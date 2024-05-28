
public class Revista extends Publicacao {
	private int numEdicao;
	private String mesPublicacao;
	
	public void Revista(String titu, String aut, int anoPub, int numEdi, String mesPub) {
		super.setAnoPublicacao(anoPub);
		super.setAutor(aut);
		super.setTitulo(titu);
		this.numEdicao = numEdi;
		this.mesPublicacao = mesPub;
	}
	//get 
	public int getNumEdicao() {
		return this.numEdicao;
	}
	public String getMesPublicacao() {
		return this.mesPublicacao;
	}
	//Fim_get
	
	//set
	public void setNumEdicao(int numEdi) {
		this.numEdicao = numEdi;
	}
	public void setMesPublicacao(String mesPub) {
		this.mesPublicacao = mesPub;
	}
	//Fim_set
	
	@Override
	public String exibirDetalhes() {
		return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado no Ano de:  " + super.getAnoPublicacao()+ " Que é a "+this.numEdicao+"° Publicada em: "+this.mesPublicacao;
	}
	public String exibirDetalhes(boolean mes) {
		if(mes) {
			return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado no Ano de:  " + super.getAnoPublicacao()+ " Que é a "+this.numEdicao+"° Publicada em: "+this.mesPublicacao;
		}else {
			return "O nome Do livro é: " + super.getTitulo() + " Do autor: " + super.getAutor() + " Publicado no Ano de: " + super.getAnoPublicacao()+ " Que é a "+this.numEdicao+"°";
		}
	}
}
