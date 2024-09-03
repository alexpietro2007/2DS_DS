
public class jogoFisico extends Jogo {
	private int quantJogadores;
	private double tempoPartida;
	
	//set
	void setQuantJogadores (int quant){
		this.quantJogadores = quant;
	}
	void setTempoPartida (double tempo){
		this.tempoPartida = tempo;
	}
	//get
	int getQuantJogadores (){
		return this.quantJogadores;
	}
	double getTempoPartida (){
		return this.tempoPartida;
	}

	Double calcularTempoTotal (int quant){
		return this.tempoPartida*quant;
	}

	@Override
	public String exibirInformacoes() {
		return "nome do jogo: " + super.getNome() + " preço: " + super.getPreco() + " distribuidora: " + super.getDistribuidora() + " quantidade de Jogadores: "+this.quantJogadores+" Tempo de Parida: ";
	}
}
