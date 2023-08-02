package v1.cliente;

import java.util.ArrayList;
import java.util.List;

import pojos.Alumno;
import pojos.Profesor;

public class Principal {

	public static void main(String[] args) {

		Alumno[] alumnos = {new Alumno("Patrobas"),new Alumno("Tercio"),
				new Alumno("Andronico"),new Alumno("Rolas")};
		
		List<Profesor> profesores = new ArrayList<>();
		profesores.add(new Profesor("Epeneto"));
		profesores.add(new Profesor("Junias"));
		profesores.add(new Profesor("Amplias"));
		profesores.add(new Profesor("Urbano"));
		
		System.out.println("** Alumnos **");
		mostrar(alumnos);
		System.out.println("** Profesores **");
		mostrar(profesores);
		
	}
	
	static void mostrar(Alumno[] alumnos) {
		for (int i=0; i<alumnos.length; i++) {
			Alumno a = alumnos[i];
			System.out.println(a);
		}
	}
	
	static void mostrar(List<Profesor> profesores) {
		for (int i=0; i<profesores.size(); i++) {
			Profesor p = profesores.get(i);
			System.out.println(p);
		}
	}

}
