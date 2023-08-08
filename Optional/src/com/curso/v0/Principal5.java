package com.curso.v0;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Principal5 {

	public static void main(String[] args) {

		List<String> companyNames = null;
				//Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
		
		//System.out.println(companyNames.size());
		
		Optional<List<String>> listOptional = Optional.ofNullable(companyNames);

		int size = listOptional.map(List::size)
					.orElse(0);
		
		System.out.println(size);

	}

}
