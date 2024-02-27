package revisao;
import java.util.Scanner;

public class exer3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int senha, i;
		
		
		for(i = 0; i < 1;) {
			System.out.println("Entre com a senha:");
			senha = in.nextInt();
			if(senha == 2002) {
				System.out.println("Acesso Permitido");
				i++;
			}else {
				System.out.println("Senha Invalida");
			}
		}
	}
}
