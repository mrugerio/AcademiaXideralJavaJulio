
public class Alumno  {
	
	
	final String nombre;
	final StringBuilder matricula;
	final int edad;
	
	public Alumno(String nombre, StringBuilder matricula, int edad) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.edad = edad;
	}
	
	final void getExamen(){
		System.out.println("realiza examen");
	}
	
	
	
}
