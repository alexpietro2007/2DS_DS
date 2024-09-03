public abstract class Veiculo {
    private String modelo;
    private double valorTabela;
    private String cor;
    private String combustivel;
    private double ipva;

    // GET
    public String getModelo() {
        return this.modelo;
    }

    public double getValorTabela() {
        return this.valorTabela;
    }

    public String getCor() {
        return this.cor;
    }

    public String getCombustivel() {
        return this.combustivel;
    }

    public Double getIpva() {
        return this.ipva;
    }

    // SET
    public void setModelo(String x) {
        this.modelo = x;
    }

    public void setValorTabela(Double x) {
        this.valorTabela = x;
    }

    public void setCor(String x) {
        this.cor = x;
    }

    public void setCombustivel(String x) {
        this.combustivel = x;
    }

    public void setIpva(double x) {
        this.ipva = x;
    }

    // METEODOS
    public void calculaIpva() {

    }

    public void imprimirFicha() {
        calculaIpva();
        System.out.print(apres());  // Use System.out.print para imprimir a string formatada
    }
    
    public String apres() {
        return String.format(
            "Modelo: %s\nValor tabela: %.2f\nCor: %s\nCombustivel: %s\nIpva: %.2f\n",
            this.modelo,
            this.valorTabela,
            this.cor,
            this.combustivel,
            this.ipva
        );
    }
    
}
