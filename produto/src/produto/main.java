package produto;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String perg = "";
		Produto pro1 = new Produto();
		for(int repeat = 0; repeat == 0;) {
			System.out.println("Insira nome do Produto:");
			pro1.setNome(in.next());
			
			System.out.println("Insira o Preço de Custo:");
			pro1.setPrecoCusto(in.nextDouble());
			
			for(String i = "" ; i != "valor aceito";) {
				System.out.println("Insira o Preco de Venda:");
				System.out.println(pro1.setPrecoVenda(in.nextDouble()));
				i = pro1.i;
			}
			
			System.out.println(pro1.calcularMargemLucro());
			System.out.println("Quer Colocar outro Produto:");
			perg = in.next();
			if(perg.equalsIgnoreCase("sim")) {
				repeat = 0;
			}else {
				repeat = 1;
			}
		}
	}
}
