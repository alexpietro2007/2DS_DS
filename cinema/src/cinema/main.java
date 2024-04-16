package cinema;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos Filmes você ira adicionar");
		int i = in.nextInt();
		
		Filme[] filmes = new Filme[i];
		for(int add = 0; add < i; add++) {
			filmes[add] = new Filme();
			
			System.out.println("Qual o nome do filme:");
			filmes[add].setNome(in.nextLine());
			filmes[add].setNome(in.nextLine());
			
			System.out.println("Qual a duração do filme:");
			filmes[add].setDuracaoMin(in.nextDouble());
		}
		
		for(int apre = 0; apre < i; apre++) {
			if(apre == 0) {
				System.out.print("Os filmes em cartaz são ");
				System.out.print(filmes[apre].getNome());
				System.out.println(" com duração em horas de ");
				System.out.print(filmes[apre].exibirDuracaoHora());
			}else {
				System.out.println(" , "+filmes[apre].getNome()+" com duração de " + filmes[apre].exibirDuracaoHora());
			}
		}
	}
}
