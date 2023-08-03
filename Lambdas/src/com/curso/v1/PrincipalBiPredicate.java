package com.curso.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;


public class PrincipalBiPredicate {
	
	public static void main(String[] args) {
		
	
		Employee e = new Employee(4, "Filologo", 500.0);
		
		//DEFINICION LAMBDA
		BiPredicate<Employee,Double> bp01 = (x,y) -> true;
		
		boolean res = bp01.test(e,10.0);
		
		System.out.println(res);
		
		//DEFINICION DE LAMBDA
		bp01 = (x,y) -> e.getSalary() > y;
		
		res = bp01.test(e,100.0);
		
		System.out.println(res);
		
		//DEFINICION DE LAMBDA
		BiPredicate<String,Employee> bp02 = (x,y) -> y.getNombre().equals(x);
				
		res = bp02.test("Filologo",e);
				
		System.out.println(res);
		

		System.out.println("***********");
		List<Employee> listOfEmps = new ArrayList<>();
				
		listOfEmps.add(new Employee(0, "Patrobas", 100.0)); 
		listOfEmps.add(new Employee(1, "Tercio", 200.0));
		listOfEmps.add(new Employee(2, "Andronico", 300.0)); 
		listOfEmps.add(new Employee(3, "Epeneto", 400.0));
		listOfEmps.add(new Employee(4, "Filologo", 500.0));
		
		listOfEmps.removeIf(emp -> emp.getSalary()<=300);
		
		listOfEmps.forEach(x -> System.out.println(x));
		
	}

}
