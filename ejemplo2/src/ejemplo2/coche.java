package ejemplo2;

public class coche {
	int velocidad;
	int luces;
	int motor;
	
	coche(int velocidad, int luces, int motor) {
		this.velocidad=velocidad;
		this.luces=luces;
		this.motor=motor;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getLuces() {
		return luces;
	}

	public void setLuces(int luces) {
		this.luces = luces;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "coche [velocidad=" + velocidad + ", luces=" + luces + ", motor=" + motor + "]";
	}
	
	
}
