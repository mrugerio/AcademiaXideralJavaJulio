package com.curso.v2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	//HAS-A
	//Observer obs1;
	//Observer obs2;
	//Observer obs3;
	
	//HAS-A
	List<Observer> listaPokemones = new ArrayList<>();
	
	void attach(Observer o) {
		listaPokemones.add(o);
	}
	
	void detach(Observer o) {
		listaPokemones.remove(o);
	}
	
	void notificar() {
		for (Observer o: listaPokemones) {
			o.update();
		}
	}
	

}
