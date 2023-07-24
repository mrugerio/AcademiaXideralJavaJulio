
public class Principal2 {

	public static void main(String[] args) {

		//INMUTABLE
		String x = "Hello";
		
		x = "Hola";
		
		System.out.println(x);
		
		//MUTABLE
		StringBuilder sb = new StringBuilder("Hola");
		
		sb = sb.append(" mundo");
		
		System.out.println(sb);

		
		
	}

}
