
public class Gerente extends Funcionario {
    private int senha;

    // M�todo para obter a senha
    public int getSenha() {
        return senha;
    }

    // M�todo para definir a senha
    public void setSenha(int senha) {
        this.senha = senha;
    }

    // M�todo para autenticar a senha
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    // M�todo que retorna o valor da bonifica��o do gerente
    @Override
    public double getBonificacao() {
        return super.getSalario() * 0.15;
    }
}
