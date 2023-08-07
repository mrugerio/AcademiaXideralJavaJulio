package com.curso.v1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class TestComposite {

	@Test
	void testLeaf1() {
		double d = 6.0;
		Component c = new LeafConstante(d);
		assertEquals(c.getValor(),d);
	}
	
	@Test
	void testLeaf2() {
		double d1 = 6.0;
		double d2 = 9.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		assertEquals(c1.getValor(),d1);
		assertEquals(c2.getValor(),d2);
	}
	
	@Test
	void testSuma() {
		double d1 = 6.0;
		double d2 = 9.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new ComponentSuma(c1,c2);
		assertEquals(c3.getValor(), 15.0);
	}
	
	@Test
	void testResta() {
		double d1 = 15.0;
		double d2 = 9.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new ComponentResta(c1,c2);
		assertEquals(c3.getValor(), 6.0);
	}
	
	@Test
	void testMulti() {
		double d1 = 5.0;
		double d2 = 9.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new ComponentMulti(c1,c2);
		assertEquals(c3.getValor(), 45.0);
	}
	
	@Test
	void testDiv() {
		double d1 = 15.0;
		double d2 = 3.0;
		Component c1 = new LeafConstante(d1);
		Component c2 = new LeafConstante(d2);
		Component c3 = new ComponentDiv(c1,c2);
		assertEquals(c3.getValor(), 5.0);
	}
	
	@Test
	void testComplejo1() {
		
		Component com = new ComponentResta(
								new ComponentSuma(
										new LeafConstante(2.8) ,
										new ComponentResta(
												new LeafConstante(7.8),
												new LeafConstante(1.8)
										) 
								)
								,
								new ComponentResta(
										new ComponentResta(
												new LeafConstante(3.8),
												new ComponentSuma(
														new LeafConstante(4.8),
														new LeafConstante(8.8)
												) 
										)  ,
										new ComponentSuma(
												new LeafConstante(7.8),
												new LeafConstante(9.8)
										) 
								)
						);
		
		assertEquals(com.getValor(),36.2);
		
	}
	
	
	@Test
	void testComplejo2() {
		
		Component com = new ComponentMulti(
					new ComponentDiv(
						new LeafConstante(2.8)	
					,
						new ComponentResta(
								new ComponentMulti(
										new LeafConstante(5.8)	
								,
										new LeafConstante(6.8)
								)
						,		
								new LeafConstante(1.8)	
						)
						
					)
			,
					new ComponentSuma(
							new ComponentMulti(
									new LeafConstante(3.8)	
							,
									new ComponentResta(
											new LeafConstante(4.8)		
									,
											new LeafConstante(8.8)
									)
							)
					,
							new ComponentDiv(
									new LeafConstante(7.8)	
							,
									new LeafConstante(9.8)
							)
					)				
			);
		
		assertEquals(com.getValor(),-1.07,0.01);
		
	}
	

}
