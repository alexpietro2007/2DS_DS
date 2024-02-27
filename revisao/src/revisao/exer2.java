package revisao;
import java.util.Scanner;

public class exer2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Escreva um número:");
		numero = in.nextInt();
		
		if(numero % 2 == 0){
			System.out.println("Esse número é par");
		}else
			System.out.println("Esse número é ímpar");
	}
}
