
public class Gerente extends Funcionario {
    private int senha;

    // Método para obter a senha
    public int getSenha() {
        return senha;
    }

    // Método para definir a senha
    public void setSenha(int senha) {
        this.senha = senha;
    }

    // Método para autenticar a senha
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    // Método que retorna o valor da bonificação do gerente
    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.15;
    }
}
