package com.curso.v0;
import java.util.function.ToDoubleBiFunction;

public class Principal {

	public static void main(String[] args) {

		ToDoubleBiFunction<String, Long> function = (s, l) -> Double.parseDouble(s) * l;
		double result = function.applyAsDouble("5.5", 6L); 
		System.out.println(result);
	}

}
