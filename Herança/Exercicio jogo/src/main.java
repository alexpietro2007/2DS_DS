import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        jogoFisico jogo1Fis = new jogoFisico();
        jogoEletronico jogo1Ele = new jogoEletronico();

        System.out.println("Qual o nome do jogo Fisico?");
        jogo1Fis.setNome(in.next());

        System.out.println("Qual o preço do jogo Fisico?");
        jogo1Fis.setPreco(in.nextDouble());

        System.out.println("Qual a Distribuidora do jogo Fisico?");
        jogo1Fis.setDistribuidora(in.next());

        System.out.println("Qual é a quantidade de jogadores?");
        jogo1Fis.setQuantJogadores(in.nextInt());

        System.out.println("Qual é o tempo de partida?");
        jogo1Fis.setTempoPartida(in.nextDouble());

        System.out.println("Qual a quantidade de partidas?");
        int i = in.nextInt();
        System.out.print(jogo1Fis.exibirInformacoes());
        System.err.println(jogo1Fis.calcularTempoTotal(i));


        System.out.println("Qual o nome do jogo Eletronico?");
        jogo1Ele.setNome(in.next());

        System.out.println("Qual o preço do jogo Eletronico?");
        jogo1Ele.setPreco(in.nextDouble());

        System.out.println("Qual a Distribuidora do jogo Eletronico?");
        jogo1Ele.setDistribuidora(in.next());

        System.out.println("Qual é a Plataforma?");
        jogo1Ele.setPlataforma(in.next());

        System.out.println("Qual é o Genero?");
        jogo1Ele.setGenero(in.next());

        System.out.println(jogo1Ele.exibirInformacoes());

        System.out.println("Qual a quantidade de jogadores?");
        System.out.println(jogo1Ele.quantJogadoresOnline(in.nextInt()));
    }
}
