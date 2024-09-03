import java.util.Scanner;


public class main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String resp;
        int escolha;
        for(int i = 0; i <= 0;){
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

                    System.out.println("Coloque a Largura em CM:");
                    quad.setLargura(in.nextDouble());
                    quad.apresentar();
                break;
                case 2:
                    Cubo cubo = new Cubo();

                    System.out.println("Coloque a Largura em CM:");
                    cubo.setLargura(in.nextDouble());
                    cubo.calcular();
                    cubo.apresentar();
                break;
                case 3:
                    Triangulo trian = new Triangulo();

                    System.out.println("Coloque a altura em CM:");
                    trian.setAltura(in.nextDouble());
                    System.out.println("Coloque a Largura em CM:");
                    trian.setLargura(in.nextDouble());
                    trian.apresentar();
                break;
                case 4:
                    Piramide pira = new Piramide();
                    System.out.println("Coloque a altura em CM:");
                    pira.setAltura(in.nextDouble());
                    System.out.println("Coloque a Largura em CM:");
                    pira.setLargura(in.nextDouble());
                    pira.apresentar();
                break;
                case 5:
                    Retangulo reta = new Retangulo();
                    System.out.println("Coloque a altura em CM:");
                    reta.setAltura(in.nextDouble());
                    System.out.println("Coloque a Largura em CM:");
                    reta.setLargura(in.nextDouble());
                    reta.apresentar();
                break;
                case 6:
                    Paralelepipedo para = new Paralelepipedo();
                    System.out.println("Coloque a altura em CM:");
                    para.setAltura(in.nextDouble());
                    System.out.println("Coloque a Largura em CM:");
                    para.setLargura(in.nextDouble());
                    System.out.println("Coloque o Comprimento em CM:");
                    para.setComprimento(in.nextDouble());
                    para.apresentar();
                break;
                case 7:
                    Pentagono pent = new Pentagono();

                    System.out.println("Qual o valor do Lado em CM:");
                    pent.setLado(in.nextDouble());
                    System.out.println("Qual o valor da altura em CM:");
                    pent.setAltura(in.nextDouble());
                    pent.apresentar();
                break;
                case 8:
                    PrismaPentagonal prisma = new PrismaPentagonal();

                    System.out.println("Qual o valor do Lado em CM:");
                    prisma.setLado(in.nextDouble());
                    System.out.println("Qual o valor da altura em CM:");
                    prisma.setAltura(in.nextDouble());
                    System.out.println("Qual o valor do Comprimento em CM:");
                    prisma.setComprimento(in.nextDouble());
                    prisma.apresentar();
                break;
                case 9:
                    Losango losa = new Losango();

                    System.out.println("Coloque a altura em CM:");
                    losa.setAltura(in.nextDouble());
                    System.out.println("Coloque a Largura em CM:");
                    losa.setLargura(in.nextDouble());
                    losa.apresentar();
                break;
                case 10:
                    Octaedro octa = new Octaedro();

                    System.out.println("Coloque a altura em CM:");
                    octa.setAltura(in.nextDouble());
                    System.out.println("Coloque a Largura em CM:");
                    octa.setLargura(in.nextDouble());
                    octa.apresentar();
                break;
            }
            System.out.println("Deseja Saber de Mais Alguma Forma?");
            resp = in.next();
            if(resp.toLowerCase().contains("s") || resp.toLowerCase().contains("i") || resp.toLowerCase().contains("m")){

            }else{
                System.out.println("Tenha um bom Dia :)");
                i++;
            }
        }
        in.close();
    }
}
