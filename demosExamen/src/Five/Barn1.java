package Five;

//Codigo con error
public class Barn1 {

public static void main(String args[]) {

		//OVERLOADING
        new Barn1().go(1, "hi");
        new Barn1().go(2, "hi", "world");
        new Barn1().go(3, "hi", "world","java");


}

    public void go(int x, String y){
        System.out.println(y+" ");
    }
    public void go(int x, String y, String z){
        System.out.println(z+" ");
    }
    public void go(int x, String y, String z,String w){
        System.out.println(w+" ");
    }

}