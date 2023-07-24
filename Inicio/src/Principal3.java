
public class Principal3 {

	public static void main(String[] args) {

		int i = 5;
		String s = "Hola";
		StringBuilder sb = new StringBuilder("Hello");
		
		procesar(i,s,sb);
		
		System.out.println("************");
		
		System.out.println(i); //5
		System.out.println(s); //Hola
		System.out.println(sb); //Hello World
		
	}

	private static void procesar(int i, String s, StringBuilder sb) {
		i = i+5;
		s.concat(" Mundo");
		sb.append(" World");
		
		System.out.println(i); //10 
		System.out.println(s); //Hola
		System.out.println(sb); //Hello World
		
		
	}

}
