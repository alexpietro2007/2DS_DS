package herancaExer2;

public class ClientePremium extends Cliente {
	@Override
	 public String calcularDesconto() {
    	double valor = super.getValorPedido()-(super.getValorPedido()*0.15);
    	super.setValorPromocional(valor);
    	return "O valor com desconto é: " + super.getValorPromocional();
    }
}
