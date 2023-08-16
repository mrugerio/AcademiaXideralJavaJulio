package com.curso.v0;

public class Suma {
	
	//@Autowired
	CloudSuma cloudSuma; //NO POSEEMOS CODIGO FUENTE

	int calculaSuma(int x, int y) {
		int resultado = cloudSuma.ejecutaSuma(x, y);
		return resultado;
	}

}
