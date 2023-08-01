package com.curso.v2;

public abstract class Observer {
	
	private Subject sub;
	
	public Observer(Subject sub) {
		this.sub = sub;
		this.sub.attach(this); //COMPLEJO DE ENTENDER
	}

	abstract void update();

}
