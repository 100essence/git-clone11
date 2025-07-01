package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a = new A();
		
		// field 접근 제한 테스트
		a.field1 = 0;
		a.field2 = 0;
		//a.field3 = 0; // error -> private
		
		// method 접근 제한 테스트
		a.method1();
		a.method2();
		//a.method3();  // error -> private
	}
}
