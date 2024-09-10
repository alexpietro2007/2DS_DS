public class Conteudo {
    	private String titulo;
        private String categoria; 
    public String getTitulo(){
        return this.titulo;
    }
     public String  getCategoria(){
        return this.categoria;
     }
     public void setTitulo(String x){
        this.titulo = x;
     }
     public void setCategoria(String x){
        this.categoria = x;
     }
     public String descricao (){
        return "titulo: " + this.titulo + "categoria: " + this.categoria ;
     }
}
