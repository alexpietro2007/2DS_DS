package revisao;

import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoN, anoA, idade, i = 0;
		String perg;
	
		do {
			System.out.println("Escreva seu ano de nascimento:");
			anoN = in.nextInt();
			
			System.out.println("Escreva o ano atual:");
			anoA = in.nextInt();
			
			idade = anoA - anoN;
			
			System.out.println("Você têm "+idade+" anos de idade.");
			
			if(idade < 18){
				System.out.println("E você é menor de idade.");
			}else{
				System.out.println("E você é maior de idade.");
			}
			
			System.out.println("Deseja calcular a idade de mais uma pessoa?");
			perg = in.next();
		
		}while(perg.equalsIgnoreCase("sim"));
		
		System.out.println("Programa encerrado.");
	}
}
