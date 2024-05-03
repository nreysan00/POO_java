package ejemplo7;

public class BebidaAzucarada extends Bebida {
		
	//Atributos
	private double porcentajeAzucar;
	private boolean promocion;
	
	//Contructor
	public BebidaAzucarada(double porcentajeAzucar, boolean promocion, double cantidad, double precio, String marca) {
		super(cantidad, precio, marca);
		this.porcentajeAzucar = porcentajeAzucar;
		this.promocion = promocion;
	}
	
	//Métodos
	public double getPorcentajeAzucar() {
		return porcentajeAzucar;
	}

	public void setPorcentajeAzucar(double porcentajeAzucar) {
		this.porcentajeAzucar = porcentajeAzucar;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}
	
	//Para calcular si hay promocion
	@Override
	public double getPrecio() {
		if(isPromocion()) {
			return super.getPrecio()*0.9;
		}else {
			return super.getPrecio();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "porcentajeAzucar=" + porcentajeAzucar + ", promocion=" + promocion;
	}
	
	
	
}
