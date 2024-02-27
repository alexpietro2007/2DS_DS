package revisao;
import java.util.Scanner;

public class exer1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number;
		
		System.out.println("Escreva o número:");
		number = in.nextInt();
		
		if(number > 0) {
			System.out.println("Esse número é Positivo");
		}else {
			System.out.println("Esse número é negativo");
		}
	}
}
