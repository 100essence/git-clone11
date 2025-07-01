package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public void method() {
		A a = new A();
		
		a.field1 = 0;	
		//a.field2 = 0;	// error -> default로 선언. 같은 패키지가 아니기 때문에
		//a.field3 = 0;   // error -> private로 선언. private은 자기 자신의 클래스에서만 사용 가능
		
		a.method1();
		//a.method2();    // error -> default로 선언. 같은 패키지가 아니기 때문에
		//a.method3();  // error -> private
	}
}
