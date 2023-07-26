
public class Principal {

	public static void main(String[] args) {
		Alumno a = new Alumno("Patrobas",new StringBuilder("x100"),20);
		
		System.out.println(a.matricula);
		
		//a.edad = 30;
		//a.nombre = a.nombre.concat("Andronico");
		a.matricula.append("200");
		
		System.out.println(a.nombre);

		
	}
	
}
