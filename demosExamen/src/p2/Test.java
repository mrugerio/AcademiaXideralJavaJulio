package p2;

import p1.*;
import p3.*;

class Test extends DoClass {
	
	Test(){
		super();
	}
	
	public static void main(String[] args) {
		DoClass doi = new Test();
		doi.m1(100);
		doi.m2(200);

	}

}
