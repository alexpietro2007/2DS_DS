package revisao;

import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n[][];
		int t, i;
		n = new double [3][4];
		
		for(i = 0; i < 3; i++) {
			for(t = 0; t < 4;t++) {
				System.out.println("insira a "+(t+1)+"º Nota do "+(i+1)+"º aluno" );
				n[i][t] = in.nextDouble();
			}
		}
		
		for(i = 0; i < 3; i++) {
			for(t = 0; t < 4;t++) {
				System.out.println(+(t+1)+"º Nota :"+n[i][t]+" do "+(i+1)+"º aluno" );
			}
		}
	}
}
