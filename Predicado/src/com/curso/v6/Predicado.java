package com.curso.v6;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);

}
