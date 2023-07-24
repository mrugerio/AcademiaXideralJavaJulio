
public class HelloWorld {

	public static void main(String[] args) {

		int entero = 8; //PROCEDURAL
		
		//POOL Strings
		String x = "Hello"; //OO
		String y = "Hello";
		String z = "Hello";
		String w = new String("Hello");
		
		//Cuantos Objetos?
		//1
		
		boolean resultado = (x == y);
		System.out.println(resultado); //true
		
		System.out.println(x == w); //false

		
		resultado = x.equals(y);
		System.out.println(resultado); //true

		resultado = (x == w);
		System.out.println(resultado); //false
		
		resultado = x.equals(w);
		System.out.println(resultado); //true
		
		
		
	}

}
