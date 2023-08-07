package com.curso.v0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestComposite {

	@Test
	void testA() {
		double d1 = 4.0;
		Assertions.assertEquals(d1,4.0);
	}
	
	@Test
	void testB() {
		double d1 = 4.0;
		double d2 = 5.0;
		Assertions.assertEquals(d1+d2,9.0);
	}
	
	

}
