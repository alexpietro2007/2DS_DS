
public class Moto extends Veiculo {
	private int cc;
	
	void setCc (int cc) {
		this.cc = cc;
	}
	int getCc (int cc) {
		return this.cc;
	}
	@Override
	public String apresentar() {
		return "Marca: "+super.getMarca()+" Modelo: "+super.getModelo()+" Ano: "+super.getAno()+" Cor: "+super.getCor()+" Cilindradas: "+this.cc;
	}
}
