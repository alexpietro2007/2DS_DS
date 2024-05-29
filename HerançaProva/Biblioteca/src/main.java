import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		
		System.out.println("Quantas Publicações Você vai inserir:");
		i = in.nextInt();
		
		Publicacao[] publi = new Publicacao[i];
		for(int add = 0; add < i; add++) {
			publi[add] = new Publicacao();
			
			System.out.println("Qual o nome da "+(add +1)+"° Publicação:");
			publi[add].setTitulo(in.nextLine());
			publi[add].setTitulo(in.nextLine());
			
			System.out.println("Qual o Autor da "+(add+1)+"° Publicação:");
			publi[add].setAutor(in.nextLine());
			
			System.out.println("Qual o ano da "+(add+1)+"° Publicação:");
			publi[add].setAnoPublicacao(in.nextInt());
		}
		for(int apre = 0;apre <i; apre++) {
			System.out.println(publi[apre].exibirDetalhes());
		}
		
		System.out.println("Quantas Revistas deseja Registrar?");
		i = in.nextInt();
		
		Revista[] revista = new Revista[i];
		for(int add = 0; add < i; add++) {
			revista[add] = new Revista();
			System.out.println("Qual o nome da "+(add +1)+"° Revista:");
			revista[add].setTitulo(in.nextLine());
			revista[add].setTitulo(in.nextLine());
			
			System.out.println("Qual o Autor da "+(add+1)+"° Revista:");
			revista[add].setAutor(in.nextLine());
			
			System.out.println("Qual o ano da "+(add+1)+"° Revista:");
			revista[add].setAnoPublicacao(in.nextInt());
			
			System.out.println("Qual o  numero da Edição?");
			revista[add].setNumEdicao(in.nextInt());
			
			System.out.println("Qual o Mês da Publicação");
			revista[add].setMesPublicacao(in.next());
		}
		for(int apre = 0;apre <i; apre++) {
			System.out.println("Deseja Mostra o Mês de Publição? ");
			boolean bool = in.nextBoolean();
System.out.println(revista[apre].exibirDetalhes(bool));
		}
		
		System.out.println("Quantas Livros deseja Registrar?");
		i = in.nextInt();
		
		Livro[] livro = new Livro[i];
		for(int add = 0; add < i; add++) {
			livro[add] = new Livro();
			System.out.println("Qual o nome da "+(add +1)+"° Livro:");
			livro[add].setTitulo(in.nextLine());
			livro[add].setTitulo(in.nextLine());
			
			System.out.println("Qual o Autor da "+(add+1)+"° Livro:");
			livro[add].setAutor(in.nextLine());
			
			System.out.println("Qual o ano da "+(add+1)+"° Livro:");
			livro[add].setAnoPublicacao(in.nextInt());
			
			System.out.println("Qual o  numero da numero de paginas?");
			livro[add].setNumPaginas(in.nextInt());
			
			System.out.println("Qual o nome da Editora?");
			livro[add].setEditora(in.next());
		}
		for(int apre = 0;apre <i; apre++) {
			System.out.println("Deseja Mostra o nome da editora? ");
			boolean bool = in.nextBoolean();
			System.out.println(livro[apre].exibirDetalhes(bool));
		}
		
	}
	
	
}
