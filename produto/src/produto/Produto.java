package produto;

public class Produto {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	String i = "";
	
	String getNome() {
		return this.nome;
	}
	double getPrecoCusto() {
		return this.precoCusto;
	}
	double getPrecoVenda() {
		return this.precoVenda;
	}
	double getmargemLucro() {
		return this.margemLucro;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	void setPrecoCusto(double preco) {
		this.precoCusto = preco;
	}
	String setPrecoVenda(double preco) {
		if(this.precoCusto > preco) {
			return this.i = "valor abaixo do preço de compra";
		}else {
			this.precoVenda = preco;
			return this.i = "valor aceito";
		}
	}
	String calcularMargemLucro() {
		return "O valor da Margem de Lucro em porcetagem é: "+(100*((this.precoVenda - this.precoCusto)/this.precoCusto));
	}
	
}

