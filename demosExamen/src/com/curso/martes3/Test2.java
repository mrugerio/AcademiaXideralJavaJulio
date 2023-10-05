package com.curso.martes3;

import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) {
//		int[] arr  = new int[3];
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		
//		int[] arr  = new int[]{10,20,30};
		
		int[] arr = {10,20,30};
		doChange(arr);

		for(int x:arr) {
			System.out.print(x+", ");  //11,21,31
		}
		
		//doChange(new int[]{arr[0],arr[1],arr[2]});
		doChange(arr);
		System.out.println("");
		System.out.println(arr[0]+", "+arr[1]+", "+arr[2]);
		//12,22,32
	}

	

	private static void doChange(int[] arreglo) {
		
		for(int pos=0; pos < arreglo.length; pos++) {
			arreglo[pos] = arreglo[pos] + 1;
			//arr[pos]++;
		}
		
		//System.out.println(Arrays.toString(arr));
		
		
	}

}
