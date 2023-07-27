
public class Principal {

	public static void main(String[] args) {
//		double unCentavo = 0.01;
//		double suma=unCentavo+
//				unCentavo+
//				unCentavo+
//				unCentavo+
//				unCentavo+
//				unCentavo;
//		System.out.println(suma);
		
		java.math.BigDecimal unCentavo = new java.math.BigDecimal("0.01");
		java.math.BigDecimal suma=unCentavo.add(unCentavo).add(unCentavo).add(unCentavo).add(unCentavo).add(unCentavo);
		System.out.println(suma);
	}

}
