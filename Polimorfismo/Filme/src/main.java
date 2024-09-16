import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {
        String titulo;
        int duracao;
        int quantEp;
        int quantT;
        int contador = 1;
        String resposta;
        
        Scanner in = new Scanner(System.in);
        ArrayList<Filme> ListadeFilmes = new ArrayList<>();
        ArrayList<Serie> ListaDeSeries = new ArrayList<>();
        
        // Loop para adicionar filmes
        do {
            System.out.println("Qual o nome do " + contador + "º Filme:");
            titulo = in.nextLine();

            System.out.println("Qual a duração do " + contador + "º Filme (em minutos)?");
            duracao = in.nextInt();

            ListadeFilmes.add(new Filme(titulo, duracao));
            contador++;
            
            in.nextLine();  // Consumir a nova linha pendente após o nextInt()

            System.out.println("Deseja adicionar mais um filme? (sim/não)");
            resposta = in.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        // Resetar contador e resposta
        contador = 1;
        resposta = "";

        // Loop para adicionar séries
        do { 
            System.out.println("Qual o nome da " + contador + "º Série:");
            titulo = in.nextLine();

            System.out.println("Qual a duração da " + contador + "º Série (em minutos)?");
            duracao = in.nextInt();

            System.out.println("Qual a quantidade de episódios da " + contador + "º Série?");
            quantEp = in.nextInt();

            System.out.println("Qual a quantidade de temporadas da " + contador + "º Série?");
            quantT = in.nextInt();

            ListaDeSeries.add(new Serie(titulo, duracao, quantEp, quantT));

            contador++;
            
            in.nextLine();

            System.out.println("Deseja adicionar mais uma série? (sim/não)");
            resposta = in.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));


        System.out.println("\nLista de Filmes:");
        for (Filme filme : ListadeFilmes) {
            System.out.println(filme);
        }


        System.out.println("\nLista de Séries:");
        for (Serie serie : ListaDeSeries) {
            System.out.println(serie);
        }
    }
}

