
public class jogoEletronico extends Jogo {
	private String plataforma;
	private String genero;
	
	//set
	void setPlataforma (String plat) {
		this.plataforma = plat;
	}
	void setGenero (String gene) {
		this.genero = gene;
	}
	
	//get
	String getPlataforma () {
		return this.plataforma;
	}
	String getGenero () {
		return this.genero;
	}
	
	String quantJogadoresOnline (int quant) {
		return  "Jogando online com "+quant+" jogadores";
	}

	@Override
	public String exibirInformacoes() {
		return "nome do jogo: " + super.getNome() + " preço: " + super.getPreco() + " distribuidora: " + super.getDistribuidora() + " Platarforma: "+this.plataforma+" Genero: "+ this.genero;
	}
}
