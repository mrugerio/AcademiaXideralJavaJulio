package v2.cliente;

import java.util.*;

import pojos.Profesor;

public class Principal {

	public static void main(String[] args) {
		
		Iterator<Profesor> profesorIterator;
		
		System.out.println("** Profesores ArrayList **");
		
		List<Profesor> profesoresArray = new ArrayList<>();
		profesoresArray.add(new Profesor("Epeneto Array"));
		profesoresArray.add(new Profesor("Junias Array"));
		profesoresArray.add(new Profesor("Amplias Array"));
		profesoresArray.add(new Profesor("Urbano Array"));
		
		profesorIterator = profesoresArray.iterator();
		mostrar(profesorIterator);
		
		System.out.println("** Profesores ArrayDeque **");
		
		Deque<Profesor> profesoresDeque = new ArrayDeque<>();
		profesoresDeque.add(new Profesor("Epeneto Deque"));
		profesoresDeque.add(new Profesor("Junias Deque\""));
		profesoresDeque.add(new Profesor("Amplias Deque\""));
		profesoresDeque.add(new Profesor("Urbano Deque\""));
		
		profesorIterator = profesoresDeque.iterator();
		mostrar(profesorIterator);
		
		System.out.println("** Profesores LinkedList **");

		Deque<Profesor> profesoresLinked = new LinkedList<>();
		profesoresLinked.add(new Profesor("Epeneto Link"));
		profesoresLinked.add(new Profesor("Junias Link"));
		profesoresLinked.add(new Profesor("Amplias Link"));
		profesoresLinked.add(new Profesor("Urbano Link"));
		
		profesorIterator = profesoresLinked.iterator();
		mostrar(profesorIterator);
		
		
	}

	private static void mostrar(Iterator<Profesor> iterator) {
		while(iterator.hasNext()) {
			Profesor profe = iterator.next();
			System.out.println(profe);
		}
	}
	

	
	

}
