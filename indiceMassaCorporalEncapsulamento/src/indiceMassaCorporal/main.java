package indiceMassaCorporal;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Imc imc = new Imc();
		
		System.out.println("Qual o Seu Nome:");
		imc.setNome(in.next());
		
		System.out.println("Qual sua Idade:");
		imc.setIdade(in.nextInt());
		
		System.out.println("Qual seu peso em kg:");
		imc.setPeso(in.nextDouble());
		
		System.out.println("Qual sua Altura em Metros:");
		imc.setAltura(in.nextDouble());
		
		System.out.println(imc.calcularImc());
	}
}
