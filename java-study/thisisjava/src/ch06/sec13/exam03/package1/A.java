package ch06.sec13.exam03.package1;

public class A {
	public int field1;	// public field
	int field2;			// default
	private int field3; // private
	
	public void method1() {
		field1 = 0;
		field2 = 0;
		field3 = 0;
		
		method2();
	}		// public method
	void method2() {
		field1 = 0;
		field2 = 0;
		field3 = 0;
		
		method3();
	}				// default
	private void method3() {
		field1 = 0;
		field2 = 0;
		field3 = 0;
	}		// private
}
