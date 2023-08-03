package com.curso.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class PrincipalFunction {

	public static void main(String[] args) {

		Function<String,Integer> fun1 = x -> x.length();
		int res = fun1.apply("HelloWorld");
		System.out.println(res);
		
		Function<StringBuilder,Employee> fun2 = 
				sb -> new Employee(0,sb.toString(),200.0);
				
		Employee e = fun2.apply(new StringBuilder("Filologo"));
		
		System.out.println(e);
		
		Function<String,String> fun3 = s -> s.concat("World");
		System.out.println(fun3.apply("Hello"));
		
		System.out.println("****************");
		
		UnaryOperator<String> uo1 = s -> s.concat("World");
		System.out.println(uo1.apply("Hello"));
		
		List<Employee> listOfEmps = new ArrayList<>();
		
		listOfEmps.add(new Employee(0, "Patrobas", 100.0)); 
		listOfEmps.add(new Employee(1, "Tercio", 200.0)); 
		listOfEmps.add(new Employee(2, "Andronico", 300.0));  
		listOfEmps.add(new Employee(3, "Epeneto", 400.0)); 
		listOfEmps.add(new Employee(4, "Filologo", 500.0)); 
		
		//Método STATIC, de Clase
		//listOfEmps.replaceAll(emp -> Employee.addSalary(emp,1.1));
		
		//Método de INSTANCIA, de Objeto
		//listOfEmps.replaceAll(emp -> emp.incrementarSalario(1.2));
		
		listOfEmps.replaceAll(emp -> {
			emp.setSalary(emp.getSalary()*1.15);
			return emp;
		});
		
		listOfEmps.forEach(em -> System.out.println(em));
		
		
		
		
	}

}
