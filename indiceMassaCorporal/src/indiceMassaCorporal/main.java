package indiceMassaCorporal;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Imc imc = new Imc();
		
		System.out.println("Qual o Seu Nome:");
		String nome = in.next();
		imc.nome = nome;
		
		System.out.println("Qual sua Idade:");
		imc.idade = in.nextInt();
		
		System.out.println("Qual seu peso em kg:");
		imc.peso = in.nextDouble();
		
		System.out.println("Qual sua Altura em Metros:");
		imc.altura = in.nextDouble();
		
		System.out.println(imc.calcularImc());
	}
}
