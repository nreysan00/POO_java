package ejemplo7;

public class AguaMineral extends Bebida {
	
	//Atributos
	private String manantial;
	
	//Constructores
	public AguaMineral(String manantial, double cantidad, double precio, String marca) {
		super(cantidad, precio, marca);
		this.manantial = manantial;
	}

	public String getManantial() {
		return manantial;
	}

	public void setManantial(String manantial) {
		this.manantial = manantial;
	}

	@Override
	public String toString() {
		return super.toString() + "manantial=" + manantial;
	}
	
	
}
