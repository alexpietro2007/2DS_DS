
public class jogoFisico {
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

	double calcularTempoTotal (int quant){
		return tempoPartida*quant;
	}
}
