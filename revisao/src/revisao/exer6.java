package revisao;

import java.util.Scanner;

public class exer6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vet[], i, tam = 6;
		
		vet = new int [tam];
		
		for(i = 0; i < tam; i++) {
			System.out.println("Entre com o "+(i+1) +"º Valor:");
			vet[i] = in.nextInt();
		}
		for(i = 0; i < tam; i++) {
			System.out.println("Na posição "+ i +" Teremos o valor "+ vet[i]);
		}
	}
}
