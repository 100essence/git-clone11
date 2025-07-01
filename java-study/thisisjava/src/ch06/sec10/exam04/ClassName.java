package ch06.sec10.exam04;

public class ClassName {
	int field1;
	void method1() {
		
	}
	
	static int field2;
	static void method2() {}
	
	static {
		//field1 = 10;
		//method1();
		field2 = 10;
		method2();
	}
	
	static void method3() {
		//this.filed1 = 10;
		//this.method1();
		
		// 객체 생성
		ClassName classname = new ClassName();
		classname.field1 = 10;
		classname.method1();
		
		field2 = 10;
		method2();
	}
}
