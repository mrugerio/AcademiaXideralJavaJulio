
public class Principal4 {
	
	public static void main(String[] args) {
		
		StringBuilder nombre = new StringBuilder("Patrobas");
		
		for(int x=0; x<1_000_000; x++) {
			
			nombre.append(x+"");
			
			System.out.println(nombre);
			
		}
		
		String s = nombre.toString();
		
	}

}
