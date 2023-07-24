import java.util.Objects;

public class Pato extends Object {
	
	String nombre;
	
	Pato(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		Pato other = (Pato) obj;
		return this.nombre.equals(other.nombre);
	}
	
	

}
