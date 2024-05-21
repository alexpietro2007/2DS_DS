package herancaExer2;

public class Cliente {
	private String nome;
	private int idade;
	private String endereco;
	private double valorPedido;
	private double valorPromocional;
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
    	this.valorPedido = valorPedido;
    }
    
    public void setValorPromocional(double valor) {
    	this.valorPromocional = valor;
    }
    
    public double getValorPromocional() {
        return valorPromocional;
    }
    
    public String calcularDesconto() {
    	this.valorPromocional = this.valorPedido-(this.valorPedido*0.10);
    	return "O valor com desconto é: " + this.valorPromocional;
    }
}
