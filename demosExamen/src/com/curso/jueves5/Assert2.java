package com.curso.jueves5;

public class Assert2 {

	public static void main(String[] args) {

		int x = 8;
		
		String r = (x==6)?"x==6":"x!=6";
		
		System.out.println(r);
		
		int i = (x==6)? 8 : 9;
		
		System.out.println(i);
		
		boolean b = (x==6)?x==6:x!=6;
		
	}

}
