package ch07.sec06.package2;

import ch07.sec06.package1.A;

// D는 A를 상속
public class D extends A {
	// 생성자
	D () {
		super();  // A생성자 호출
	}
	
	// 메소드
	void method1() {
		this.field = "value";
		this.method();
	}
	
	void method2() {
//		A a = new A();				// error
//		a.field = "value";			// error
//		a.method();					// error
	}
	
}
