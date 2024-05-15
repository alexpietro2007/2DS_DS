
public class Carro extends Veiculo{
	private int quant_portas;

	public void setQuant (int quant_portas) {
		this.quant_portas = quant_portas;
	}
	public int getQuant(){
		return this.quant_portas;
	}
	@Override
	public String apresentar() {
		return "Marca: "+super.getMarca()+" Modelo: "+super.getModelo()+" Ano: "+super.getAno()+" Cor: "+super.getCor()+" Quantidade de Portas: "+this.quant_portas;
	}
}
