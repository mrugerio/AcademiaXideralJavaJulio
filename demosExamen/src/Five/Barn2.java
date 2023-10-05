package Five;

//Codigo con error
public class Barn2 {

public static void main(String args[]) {
		System.out.println("Array");

		//OVERLOADING
        new Barn2().go(1, new String[]{"hi"});
        new Barn2().go(2, new String[]{"hi", "world"});
        new Barn2().go(3, new String[]{"hi", "world","java"});
        //new Barn2().go(4); //NO SE PUEDE

}

    public void go(int x, String[] y){
    	System.out.println(y[y.length-1]+" ");    
    }
    
    public void go(Integer[] w, int x, String... y){
    	System.out.println(y[y.length-1]+" ");    
    }
   

}