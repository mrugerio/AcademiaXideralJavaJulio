package pojos;

public class Profesor {
	
	private String nombre;

	public Profesor(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + "]";
	}

}
