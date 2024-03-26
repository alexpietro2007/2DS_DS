package indiceMassaCorporal;

public class Imc {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	void setNome(String Nome) {
		this.nome = Nome;
	}
	void setIdade(int Idade) {
		this.idade = Idade;
	}
	void setPeso(double Peso) {
		this.peso = Peso;
	}
	void setAltura(double Altura) {
		this.altura = Altura;
	}
	
	
	String calcularImc() {
		double imc = peso/(altura*altura);
		if(imc < 18.5) {
			return this.nome+" você tem "+this.idade+" anos Com um imc de: "+imc+" Você esta Abaixo do peso"; 
		}else if(imc < 24.9) {
			return this.nome+" você tem "+this.idade+" anos Com um imc de: "+imc+" Você esta com Peso Normal";
		}else if(imc < 29.9) {
			return this.nome+" você tem "+this.idade+" anos Com um imc de: "+imc+" Você esta com Sobre Peso";
		}else if(imc < 34.9) {
			return this.nome+" você tem "+this.idade+" anos Com um imc de: "+imc+" Você esta com Obesidade Grau 1";
		}else if(imc < 39.9) {
			return this.nome+" você tem "+this.idade+" anos Com um imc de: "+imc+" Você esta com Obesidade Grau 2";
		}else {
			return this.nome+" você tem "+this.idade+" anos Com um imc de: "+imc+" Você esta com Obesidade Grau 3";
		}
		
	}
}
