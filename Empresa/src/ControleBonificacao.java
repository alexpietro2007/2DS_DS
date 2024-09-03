
// Classe para controlar os gastos da empresa com bonifica��o
public class ControleBonificacao {
    // Atributo soma, serve para somar cada uma das bonifica��es
    private double soma;

    // M�todo que recebe como par�metro um objeto do tipo Funcionario
    public void registra(Funcionario f) {
        // Obtendo a bonifica��o espec�fica do funcion�rio e armazenando o valor em double boni
        double boni = f.getBonificacao();
        // Somando a vari�vel boni dentro da vari�vel soma
        this.soma += boni;
    }

    // M�todo que retorna o valor total das bonifica��es
    public double getSoma() {
        return this.soma;
    }
}

