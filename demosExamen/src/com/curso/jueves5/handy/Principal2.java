package com.curso.jueves5.handy;

class Class1 {
	String v1; //HAS-A v1 (TIENE UN)
}

class Class2 {
	Class1 c1; //HAS-A Class1
	String v2; //HAS-A v2
}
             //IS-A Class2
class Class3 extends Class2 {
	Class2 c1; //HAS-A Class2
	String v3; //HAS-A v3
	
	//HAS-A Class1
	//HAS-A v2
	
}

//Which three options correctly describe 
//the relationship between the classes? 

//A) Class2 has-a v3 
//B) Class1 has-a v2 
//C) Class2 has-a v2 ***
//D) Class3 has-a v1 
//E) Class2 has-a Class3 
//F) Class2 has-a Class1 ***
