public class Carro extends Veiculo {
    @Override
    public void calculaIpva(){
        super.setIpva(getValorTabela()*0.4);
    }
}
