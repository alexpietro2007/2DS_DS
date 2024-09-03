import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carro car1 = new Carro();
        Carro car2 = new Carro();
        Moto mt1 = new Moto();
        Moto mt2 = new Moto();

        Carro[] carros = { car1, car2 };
        Moto[] motos = { mt1, mt2 };

        for (int i = 0; i < 2; i++) {
            System.out.println("Qual o Modelo do " + (i + 1) + "° carro: ");
            carros[i].setModelo(in.next());
            System.out.println("Qual o Valor de Tabela do " + (i + 1) + "° carro:");
            carros[i].setValorTabela(in.nextDouble());
            System.out.println("Qual a cor do " + (i + 1) + "° carro:");
            carros[i].setCor(in.next());
            System.out.println("Qual o Combustivel que o " + (i + 1) + "° Carro roda:");
            carros[i].setCombustivel(in.next());
            System.out.println("Quantos por Cento vai ser o ipva do "+(i + 1)+"° carro: ");
            carros[i].setIpva(in.nextDouble());
            System.out.println("");
            System.out.println("-------------------------------------");
            carros[i].imprimirFicha();
            System.out.println("-------------------------------------");
            System.out.println("");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Qual o Modelo do " + (i + 1) + "° Moto: ");
            motos[i].setModelo(in.next());
            System.out.println("Qual o Valor de Tabela do " + (i + 1) + "° Moto:");
            motos[i].setValorTabela(in.nextDouble());
            System.out.println("Qual a cor do " + (i + 1) + "° Moto:");
            motos[i].setCor(in.next());
            System.out.println("Qual o Combustivel que o " + (i + 1) + "° Moto roda:");
            motos[i].setCombustivel(in.next());
            System.out.println("Quantos por Cento vai ser o ipva do "+(i + 1)+"° Moto: ");
            motos[i].setIpva(in.nextDouble());
            System.out.println("");
            System.out.println("-------------------------------------");
            motos[i].imprimirFicha();
            System.out.println("-------------------------------------");
            System.out.println("");
        }
        in.close();
    }
}
