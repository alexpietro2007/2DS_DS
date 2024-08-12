package cinema;

public class Filme {
	private String nome;
	private double duracaoMin;
	
	void setNome(String nome){
		this.nome = nome;
	}
	void setDuracaoMin(double valor) {
		this.duracaoMin = valor;
	}
	  
	String getNome() {
		return this.nome;
	}
	
	double getDuracaoMin() {
		return this.duracaoMin;
	}
	
	double exibirDuracaoHora() {
		return duracaoMin/60;
	}
}
