package indiceMassaCorporal;

public class Imc {
	String nome;
	int idade;
	double peso;
	double altura;
	
	String calcularImc() {
		double imc = peso/(altura*altura);
		if(imc < 18.5) {
			return nome+" Seu IMC é de "+imc+" Você esta Abaixo do peso"; 
		}else if(imc < 24.9) {
			return nome+" Seu IMC é de "+imc+" Você esta com Peso Normal";
		}else if(imc < 29.9) {
			return nome+" Seu IMC é de "+imc+" Você esta com Sobre Peso";
		}else if(imc < 34.9) {
			return nome+" Seu IMC é de "+imc+" Você esta com Obesidade Grau 1";
		}else if(imc < 39.9) {
			return nome+" Seu IMC é de "+imc+" Você esta com Obesidade Grau 2";
		}else {
			return nome+" Seu IMC é de "+imc+" Você esta com Obesidade Grau 3";
		}
		
	}
}
