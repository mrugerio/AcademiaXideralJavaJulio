package com.curso.v1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal2 {
	
	public static void main(String[] args) {
		
		Stream<String> stringStream = Stream.of("Java","Magazine");
		
		List<String> listaString = stringStream
		.map(s -> s.split(""))
		.flatMap(Arrays::stream)
		.distinct()
		.collect(Collectors.toList());
		
		listaString.forEach(System.out::print);
		
	}

}
