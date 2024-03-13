package exer2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 0;
		Scanner in = new Scanner(System.in);
		
		Funcionario vagner = new Funcionario();
		vagner.nome = "Vagner";
		
		Funcionario pedro = new Funcionario();
		pedro.nome = "Pedro";
		
		System.out.println("Qual o salário do Vagner?");
		vagner.salarioBruto = in.nextDouble();
		
		System.out.println("Qual o salário do Pedro?");
		pedro.salarioBruto = in.nextDouble();
		
		System.out.println("Qual o imposto do salário?");
		vagner.imposto = in.nextDouble();
		pedro.imposto = vagner.imposto;
		
		System.out.println("Qual o aumento de Vagner?");
		valor = in.nextDouble();
		System.out.println(vagner.aumentaSalario(valor));
		System.out.println(vagner.salarioLiquido());
		
		System.out.println("Qual o aumento de Pedro?");
		valor = in.nextDouble();
		System.out.println(pedro.aumentaSalario(valor));
		System.out.println(pedro.salarioLiquido());
	}

}
