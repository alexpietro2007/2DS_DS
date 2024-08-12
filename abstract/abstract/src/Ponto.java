
public class Ponto extends FormaGeometrica {
	private double coordx;
	private double coordy;
	
	public Ponto (double x, double y) {
		this.coordx = x;
		this.coordy = y;
	}
	
	public String forma() {
		return "Ponto: ("+ this.coordx +", "+this.coordy+")";
	}
}
