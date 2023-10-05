package com.curso.miercoles4;

//ABUELO = OBJECT

//PADRE
class Super{
	
	String cadena = "Super ";
	
	public String toString() {
		return "4";
	}
}

//NIETO
public class SubClass extends Super {
	
	String cadena = super.cadena + "SubClass ";

	public String toString() {
		return super.toString() + "3";
	}

	public static void main(String[] args) {
		
		//Super s = new SubClass();
		//System.out.println(s.cadena); //Super
		
		System.out.println(new SubClass().cadena);
		
		//System.out.println(new SubClass()); //43
		
//		SubClass sb = new SubClass();
//		System.out.println(sb.toString());
//		
//		System.out.println(new SubClass().toString());
	}
}




