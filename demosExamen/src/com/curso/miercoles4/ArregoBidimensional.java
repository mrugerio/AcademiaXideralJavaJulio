package com.curso.miercoles4;

public class ArregoBidimensional {
	
	public static void main(String[] args) {
		
		int[][] array2DA = new int[0][0];
		int[][] array2DB = new int[1][0];
		//array2DB[0][0] = 20; //NO SE PUEDE
		int[][] array2DC = new int[0][1];

		int[][] array2D0 = new int[1][1];
		array2D0[0][0] = 8;
		//System.out.println(array2D0[0][0]);
		
		int[][] array2D1 = new int[2][2];
		array2D1[0][0] = 1;
		array2D1[0][1] = 2;
		array2D1[1][0] = 3;
		array2D1[1][1] = 4;
		//System.out.println(array2D1[1][0]);
		
		int[][] array2D2 = new int[3][2];
		array2D2[0][0] = 1;
		array2D2[0][1] = 2;
		array2D2[1][0] = 3;
		array2D2[1][1] = 4;
		array2D2[2][0] = 5;
		array2D2[2][1] = 6;
		//System.out.println(array2D2[2][0]);
		
		//int[][] arreglo2D = {0,1};
		//int[][][] arreglo2D = {{0,1},{2,3},{4,5}};
		
		//CORRECTO
		//int[][] arreglo2D = {{0,1,3,9},{2,3},{4,5,6}};
		//System.out.println(arreglo2D[0][3]);
		
		int[][] arreglo2D = {{0,1,2,4},{5,6}};
		int[][] arreglo2 = new int[2][2];
		
		
	}

}
