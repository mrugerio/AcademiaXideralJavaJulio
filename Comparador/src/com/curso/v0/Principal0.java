package com.curso.v0;
import java.util.*;

public class Principal0 {

	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();
		
		nombres.add("Epeneto");
		nombres.add("Junias");
		nombres.add("Amplias");
		nombres.add("Urbano");
		
		Collections.sort(nombres);
		
		for (String name: nombres)
			System.out.println(name);
		
	}

}
