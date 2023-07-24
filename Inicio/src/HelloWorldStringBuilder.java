
public class HelloWorldStringBuilder {

	public static void main(String[] args) {

		
		StringBuilder x = new StringBuilder("Hello");
		StringBuilder y = new StringBuilder("Hello");
	
		//SI LAS VARIABLES APUNTAN AL MISMO OBJETO
		boolean resultado = (x==y); 
		
		resultado = (x.equals(y));
		
		System.out.println(resultado); //false
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");

		resultado = (s1.equals(s2));
		
		System.out.println(resultado); //true
		
		int i1 = 8;
		int i2 = 8;
		//System.out.println(i1==i2); //true
		
		
//		x = y;
//		y = y.append(" World");
//		System.out.println(x); //Hello World
		
		
//		x = y;
//		x = null;
		
//		String x = new String("Hello");
//		String y = new String("Hello");
//		
//		x = null;

		
	}

}
