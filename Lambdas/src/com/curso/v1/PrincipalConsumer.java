package com.curso.v1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.BiConsumer;


public class PrincipalConsumer {
	
	public static void main(String[] args) {
		
		//DEFINICION DE LA LAMBDA
		Consumer<String> con1 = x -> System.out.println(x + " World");
		
		//EJECUTAR LA LAMBDA
		con1.accept("Hello");
		
		Employee e = new Employee(4, "Filologo", 500.0);
		
		//DEFINICION DE LA LAMBDA
		//Consumer<Employee> con2 = w -> w.setSalary(200);
		Consumer<Employee> con2 = w -> w.setSalary(w.getSalary()+200);
		//EJECUTAR LA LAMBDA
		con2.accept(e);
		
		System.out.println(e);
		
		//DEFINICION
		Consumer<Integer> printEvenOrOdd = n -> System.out.println(n % 2 == 0 ? "Even" : "Odd");
		printEvenOrOdd.accept(6);
		
		System.out.println("***********");
		List<Employee> listOfEmps = Arrays.asList( 
				new Employee(0, "Patrobas", 100.0), 
				new Employee(1, "Tercio", 200.0),
				new Employee(2, "Andronico", 300.0), 
				new Employee(3, "Epeneto", 400.0),
				new Employee(4, "Filologo", 500.0) 
		);
		
		//DECLARATIVA
		listOfEmps.forEach(t -> t.setSalary(t.getSalary()+10));
		listOfEmps.forEach(x -> System.out.println(x));
		//listOfEmps.forEach(System.out::println);

		
		
		//IMPERATIVA
//		for(Employee emp:listOfEmps) {
//			double res = emp.getSalary()+10;
//			emp.setSalary(res);
//			System.out.println(emp);	
//		}
		
		System.out.println("**BiConsumer**");
		
		Employee emp1 = new Employee(4, "Filologo", 500.0);
		
		//DEFINICION DE LAMBDA
		BiConsumer<Employee,Double> biCons = 
				(u,v) -> u.setSalary(u.getSalary()+v);
				
		//EJECUTAR LA LAMBDA
		biCons.accept(emp1, 50.0);
		
		System.out.println(emp1);
		
	}

}
