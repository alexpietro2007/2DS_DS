public class Moto extends Veiculo {
    @Override
    public void calculaIpva(){
        super.setIpva(getValorTabela()*0.2);
    }

}
