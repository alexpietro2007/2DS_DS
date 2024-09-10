import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Filme extends Conteudo {
    private Date duracao;
    private  String f3 = "hh:mm:ss";
    DateFormat df3 = new SimpleDateFormat(f3);
    
    public String getDate (){
        return df3.format(this.duracao);
    }
    public void setDuracao (Date x){
        this.duracao = x;
    }
}
