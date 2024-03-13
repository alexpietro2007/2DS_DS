package exer2;

public class Funcionario {
	
	String nome;
	Double salarioBruto;
	Double imposto;
	
	String salarioLiquido() {
		salarioBruto = salarioBruto - imposto;
		return "o novo salario liquido de "+nome+" é: R$"+salarioBruto;
	}
	String aumentaSalario(double valor) {
		salarioBruto = salarioBruto + (salarioBruto *(valor/100));
		return "O salario de "+nome+" foi: R$"+(salarioBruto- valor)+" Para: R$"+salarioBruto;
	}
}
