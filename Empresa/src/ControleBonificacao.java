
// Classe para controlar os gastos da empresa com bonificação
public class ControleBonificacao {
    // Atributo soma, serve para somar cada uma das bonificações
    private double soma;

    // Método que recebe como parâmetro um objeto do tipo Funcionario
    public void registra(Funcionario f) {
        // Obtendo a bonificação específica do funcionário e armazenando o valor em double boni
        double boni = f.getBonificacao();
        // Somando a variável boni dentro da variável soma
        this.soma += boni;
    }

    // Método que retorna o valor total das bonificações
    public double getSoma() {
        return this.soma;
    }
}

