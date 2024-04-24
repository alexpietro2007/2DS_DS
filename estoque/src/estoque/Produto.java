package estoque;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	public Produto(String nome, int id, double preco){
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	int getId() {
		return this.id;
	}
	String getNome() {
		return this.nome;
	}
	double getPreco() {
		return this.preco;
	}
	void setId(int id) {
		this.id = id;
	}
	void setNome(String nome) {
		this.nome = nome;
	}
	void setPreco(double preco) {
		this.preco = preco;
	}
	double calcularDesconto(double desconto) {
		return this.preco-this.preco*(desconto/100);
	}
}
