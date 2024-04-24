package estoque;
import java.util.Scanner;
public class testeProduto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int id = 0, i = 0;
		double preco = 0, desc[];
		String nome = "";
		
		System.out.println("Quantos produtos você quer inserir");
		i = in.nextInt();
		desc = new double [i];
		Produto[] produtos = new Produto[i];
		for(int a= 0; a < i; a++) {
			System.out.println("Qual o id do "+(a+1)+"° produto:");
			id = in.nextInt();
			System.out.println("Qual o nome do "+(a+1)+"° produto");
			nome = in.next();
			System.out.println("Qual o preço do "+(a+1)+"° produto");
			preco = in.nextDouble();
			System.out.println("Qual o Desconto do "+(a+1)+"° produto");
			desc[a] = in.nextDouble();
			produtos[a] = new Produto(nome, id, preco);
		}
		for(int apre = 0; apre < i;apre++) {
			System.out.println("Produto "+(apre+1)+": ID = "+produtos[apre].getId()+" Nome = "+produtos[apre].getNome()+" Preço = "+produtos[apre].getPreco()+" Preço com Desconto = "+ produtos[apre].calcularDesconto(desc[apre]));
		}
	}
}
