package ch06.sec13.exam01.pacakge1;

import ch06.sec07.exam04.Car;
import ch06.sec13.exam01.pacakge2.C;

public class A {
	C c;
	B b;
	Car car1;
	
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {  // public
		
	}
	
	A(int b) {			   // default
		
	}
	
	private A(String s) {	// private
		
	}
}
