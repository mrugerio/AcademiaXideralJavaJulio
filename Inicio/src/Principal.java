
public class Principal {
	
	public static void main(String[] args) {
		
		Pato pato1 = new Pato("lucas");
		
		Pato pato2 = new Pato("lucas");
		
		System.out.println(pato1.equals(pato2)); //false
		
		//equals() tiene el mismo comportamiento que ==
		
	}

}
