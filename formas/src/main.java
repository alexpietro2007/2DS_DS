import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolha;
        for(int i = 0; i > 0;){
            System.out.println("----Qual Forma Você deseja Calcular----");
            System.out.println("1.Quadrado");
            System.out.println("2.Cubo");
            System.out.println("3.Triângulo");
            System.out.println("4.Pirâmide");
            System.out.println("5.Retângulo");
            System.out.println("6.Paralelepípedo");
            System.out.println("7.Pentágono");
            System.out.println("8.Prisma Pentagonal");
            System.out.println("9.Losango");
            System.out.println("10.Octaedro");
            System.out.println("----Escolha o Número----:");
            escolha = in.nextInt();

            switch (escolha){
                case 1:
                    Quadrado quad = new Quadrado();

                    System.out.println("Coloque a Largura:");
                    quad.setLargura(in.nextDouble());

                    quad.forma();
                break;
            };
        };
    }
}
