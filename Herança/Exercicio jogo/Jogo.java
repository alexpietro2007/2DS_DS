
public class Jogo {

	
  private String nome;
  public double preco;
  private String distribuidora;

  public void Jogo(String nome,double preco,String distribuidora) {
	this.nome = nome;
	this.preco = preco;
	this.distribuidora = distribuidora;
	
	//getters
}
  public String getNome() {
    	return this.nome;
}
  public double getPreco() {
    	return preco;
}
  public String getDistribuidora() {
    	return this.distribuidora;
}

    
     //setters

  public void setNome (String nome) {
    	this.nome = nome;
}
  public void setPreco (double preco) {
    	this.preco = preco;
}
  public void setDistribuidora (String distribuidora) {
    	 this.distribuidora = distribuidora;
}
  public String exibirInformacoes() {
	  return "nome do jogo:" + nome + "preço:" + preco + "distribuidora:" + distribuidora;
  }

}