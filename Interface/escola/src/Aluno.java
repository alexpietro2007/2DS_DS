
public class Aluno implements Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String matricula;

    public Aluno(String nome, String endereco, String telefone, String matricula) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;

    }
// Getters
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public String getEndereco() {
        return this.endereco;

    }
    @Override
    public String getTelefone() {
        return this.telefone;
    }

    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    @Override
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String toString(){
        return "nome: " + this.nome + "\n Endereço: "+ this.endereco + "\n Telefone: "+ this.telefone+ "\n Matricula: "+ this.matricula;
    }

}
