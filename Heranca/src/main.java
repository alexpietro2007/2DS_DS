import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Carro carro = new Carro[];
		Moto moto = new Moto[];
		
		System.out.println("marca do carro:");
		carro.setMarca(in.next());
		
		System.out.println("Modelo do Carro:");
		carro.setModelo(in.next());
		
		System.out.println("Ano de Fabricação do Carro:");
		carro.setAno(in.nextInt());
		
		System.out.println("Qual a cor do Carro:");
		carro.setCor(in.next());
		
		System.out.println("marca da Moto:");
		moto.setMarca(in.next());
		
		System.out.println("Modelo da Moto:");
		moto.setModelo(in.next());
		
		System.out.println("Ano de Fabricação da Moto:");
		moto.setAno(in.nextInt());
		
		System.out.println("Qual a cor da Moto:");
		moto.setCor(in.next());
		
		System.out.println(carro.apresentar());
		System.out.println(moto.apresentar());
	}
}
