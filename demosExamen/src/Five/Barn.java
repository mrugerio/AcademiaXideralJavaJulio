package Five;

//Codigo con error
public class Barn {

public static void main(String... args) {
		System.out.println("Varags");
        new Barn().go(1, "hi");
        new Barn().go(2, "hi", "world");
        new Barn().go(3, "hi", "world","java");
        new Barn().go(4, "hi", "world","java","hello","spring");
        new Barn().go(5);
}

    public void go(int x, String... y){
    	if (y.length > 0)
        System.out.println(y[y.length-1]+" ");
    }

}