public class Professor implements Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String materia;

    public Professor(String nome, String endereco, String telefone, String materia) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
    this.materia = materia;
    }

    public String toString() {
        return "nome: " + this.nome + "\n Endereço: "+ this.endereco + "\n Telefone: "+ this.telefone+"\n Materia: "+this.materia;
    }
}