package com.curso.v1;

public class Student {
	
	private String name;
	private int age;
	
	public String getName() {
//		if (rol="admin")
//			return name;
//		else
//			return null;
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<18) 
			System.out.println("Edad incorrecta");
		else
			this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

}
