package exer1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		Quadrado primeiro = new Quadrado();
		
		System.out.println("Insira a Base:");
		primeiro.base = in.nextDouble();
		
		System.out.println("Insira a Altura:");
		primeiro.altura = in.nextDouble();
		
		System.out.println(primeiro.calcularArea());
	}

}
