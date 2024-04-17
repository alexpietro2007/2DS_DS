package calculadora;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tamV = 0, val1, val2, b[];
		double a[], val3, val4;
		Calculadora calc = new Calculadora();
		
		System.out.println("Deseja fazer uma soma ou Subtração?");
		String perg = in.next();
		if(perg.equalsIgnoreCase("soma")) {
			System.out.println("É mais de Uma soma?");
			perg = in.next();
			if(perg.equalsIgnoreCase("sim")){
				System.out.println("É número Fracionado");
				perg = in.next();
				if(perg.equalsIgnoreCase("sim")) {
					System.out.println("Quantas somas deseja fazer?");
					tamV = in.nextInt();
					a = new double [tamV];
					for(int i = 0; i < a.length; i++) {
						System.out.println("Qual o "+(i+1)+"° valor:");
						a[i] = in.nextDouble();
					}
					System.out.println("O resultado da soma é: "+calc.soma(a));
				}else {
					System.out.println("Quantas somas deseja fazer?");
					tamV = in.nextInt();
					b = new int [tamV];
					for(int i = 0; i < b.length; i++) {
						System.out.println("Qual o "+(i+1)+"° valor:");
						b[i] = in.nextInt();
					}
					System.out.println("O resultado da soma é: "+calc.soma(b));
				}
			}else {
				System.out.println("É número Fracionado");
				perg = in.next();
				if(perg.equalsIgnoreCase("sim")) {
					System.out.println("Qual o primeiro valor:");
					val3 = in.nextDouble();
					System.out.println("Qual o segundo valor:");
					val4 = in.nextDouble();
					System.out.println("O resultado é: "+calc.soma(val3, val4));
				}else{
					System.out.println("Qual o primeiro valor:");
					val1 = in.nextInt();
					System.out.println("Qual o segundo valor:");
					val2 = in.nextInt();
					System.out.println("O resultado é: "+calc.soma(val1, val2));
				}
			}
		}else {
			System.out.println("É mais de Uma subtração?");
			perg = in.next();
			if(perg.equalsIgnoreCase("sim")){
				System.out.println("É número Fracionado");
				perg = in.next();
				if(perg.equalsIgnoreCase("sim")) {
					System.out.println("Quantas subtrações deseja fazer?");
					tamV = in.nextInt();
					a = new double [tamV];
					for(int i = 0; i < a.length; i++) {
						System.out.println("Qual o "+(i+1)+"° valor:");
						a[i] = in.nextDouble();
					}
					System.out.println("O resultado da subtração é: "+calc.subtracao(a));
				}else {
					System.out.println("Quantas subtrações deseja fazer?");
					tamV = in.nextInt();
					b = new int [tamV];
					for(int i = 0; i < b.length; i++) {
						System.out.println("Qual o "+(i+1)+"° valor:");
						b[i] = in.nextInt();
					}
					System.out.println("O resultado da subtração é: "+calc.subtracao(b));
				}
			}else {
				System.out.println("É número Fracionado");
				perg = in.next();
				if(perg.equalsIgnoreCase("sim")) {
					System.out.println("Qual o primeiro valor:");
					val3 = in.nextDouble();
					System.out.println("Qual o segundo valor:");
					val4 = in.nextDouble();
					System.out.println("O resultado é: "+calc.subtracao(val3, val4));
				}else{
					System.out.println("Qual o primeiro valor:");
					val1 = in.nextInt();
					System.out.println("Qual o segundo valor:");
					val2 = in.nextInt();
					System.out.println("O resultado é: "+calc.subtracao(val1, val2));
				}
			}
		}
	}
}
