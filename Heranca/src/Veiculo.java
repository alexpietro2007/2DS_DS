
public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	//Set
	void setMarca (String m) {
		this.marca = m;
	}
	void setModelo (String m) {
		this.modelo = m;
	}
	void setAno (int a) {
		this.ano = a;
	}
	void setCor (String c) {
		this.cor = c;
	}
	//Get
	String getMarca () {
		return this.marca;
	}
	String getModelo () {
		return this.modelo;
	}
	int getAno () {
		return this.ano;
	}
	String getCor () {
		return this.cor;
	}
	
	public String apresentar () {
		return "Marca: "+this.marca+" Modelo: "+this.modelo+" Ano: "+this.ano+" Cor: "+this.cor;
	}
}
