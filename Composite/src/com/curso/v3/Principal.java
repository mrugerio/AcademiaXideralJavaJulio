package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		System.out.println(
				
			new CompositeMulti(
					new CompositeDiv(
						new LeafConstante(2.8)	
					,
						new CompositeResta(
								new CompositeMulti(
										new LeafConstante(5.8)	
								,
										new LeafConstante(6.8)
								)
						,		
								new LeafConstante(1.8)	
						)
						
					)
			,
					new CompositeSuma(
							new CompositeMulti(
									new LeafConstante(3.8)	
							,
									new CompositeResta(
											new LeafConstante(4.8)		
									,
											new LeafConstante(8.8)
									)
							)
					,
							new CompositeDiv(
									new LeafConstante(7.8)	
							,
									new LeafConstante(9.8)
							)
					)				
			).getValor()
			
		);
			
				
		
	}

}
