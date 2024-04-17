package calculadora;

public class Calculadora {
	private String nome;
	private double resultado;
	
	String getNome() {
		return this.nome;
	}
	double getResultado() {
		return this.resultado;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	public int soma (int x, int y) {
		this.resultado = x + y;
		return (int) this.resultado;
	}
	
	public double soma (double x, double y) {
		this.resultado = x + y;
		return this.resultado;
	}
	
	public int soma (int x[]) {
		int y = 0;
		for(int i = 0; i < x.length; i++ ) {
			y = y + x[i];
		}
		this.resultado = y;
		return (int) this.resultado;
	}
	
	public double soma (double x[]) {
		double y = 0;
		for(int i = 0; i < x.length; i++ ) {
			y = y + x[i];
		}
		this.resultado = y;
		return this.resultado;
	}
	
	public int subtracao(int x, int y) {
		this.resultado = x - y;
		return (int) this.resultado;
	}
	
	public double subtracao (double x, double y) {
		this.resultado = x - y;
		return this.resultado;
	}
	
	public int subtracao (int x[]) {
		int y = 0;
		for(int i = 0; i < x.length; i++ ) {
			y = x[i] - y;
		}
		this.resultado = y;
		return (int) this.resultado;
	}
	
	public double subtracao (double x[]) {
		double y = 0;
		for(int i = 0; i < x.length; i++ ) {
			y = x[i] - y;
		}
		this.resultado = y;
		return this.resultado;
	}
}
