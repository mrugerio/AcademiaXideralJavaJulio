package v1.cliente;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import pojos.Alumno;
import pojos.Profesor;

public class Principal2 {

	public static void main(String[] args) {
		
		Deque<Profesor> profesores = new ArrayDeque<>();
		profesores.add(new Profesor("Epeneto"));
		profesores.add(new Profesor("Junias"));
		profesores.add(new Profesor("Amplias"));
		profesores.add(new Profesor("Urbano"));
		
		
		System.out.println("** Profesores ArrayDeque **");
		mostrar(profesores);
		
		Deque<Profesor> profesoresLinked = new LinkedList<>();
		profesoresLinked.add(new Profesor("Epeneto Link"));
		profesoresLinked.add(new Profesor("Junias Link"));
		profesoresLinked.add(new Profesor("Amplias Link"));
		profesoresLinked.add(new Profesor("Urbano Link"));
		
		System.out.println("** Profesores LinkedList **");
		mostrar(profesoresLinked);
		
		
	}
	
	
	
	static void mostrar(Deque<Profesor> profesores) {
		for (Profesor profesor : profesores) {
		    System.out.println(profesor);
		}
	}

}
