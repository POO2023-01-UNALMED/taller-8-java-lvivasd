package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public String toString() {
		return super.toString() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
	}

	@Override
	public int compareTo(Futbolista o) {
		if (this.getEdad() <= o.getEdad()) {
			return o.getEdad() - this.getEdad();
		}
		else {
			return this.getEdad() - o.getEdad();
		}
	}

	public boolean jugarConLasManos() {
		return false;
	}
}
