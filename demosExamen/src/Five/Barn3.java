package Five;

//Codigo con error
public class Barn3 {

public static void main(String args[]) {
		System.out.println("Array 1er Param");

		//OVERLOADING
        new Barn3().go(new String[]{"hi"},1);
        new Barn3().go(new String[]{"hi", "world"},2);
        new Barn3().go(new String[]{"hi", "world","java"},3);

}

    public void go(String[] y,int x ){
    	System.out.println(y[y.length-1]+" ");    
    }
   

}