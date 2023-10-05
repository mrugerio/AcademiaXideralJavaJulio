package Three;

import java.util.Objects;

public class MyStuff {
	
	String name;



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStuff other = (MyStuff) obj;
		return Objects.equals(name, other.name);
	}

	MyStuff(String n) {
		name = n;
	}

	public static void main(String[] args) {
		MyStuff m1 = new MyStuff("guitar");
		MyStuff m2 = new MyStuff("guitar");
		//MyStuff m3 = m1;
		
		System.out.println(m2.equals(m1)); //true
		
//		String s1 = new String("hola");
//		String s2 = new String("hola");
//		
//		System.out.println(s1.equals(s2));  

	}

	
//	public boolean equals(Object o) {
//		MyStuff m = (MyStuff) o;
//		if (m.name != null) {
//			return true;
//		}
//		return false;
//	}

}
