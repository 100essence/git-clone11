package ch06.sec13.exam01.pacakge2;

import ch06.sec13.exam01.pacakge1.B;
import ch06.sec13.exam01.pacakge1.A;

public class C {
	A a1 = new A(true);
	//A a2 = new A(1);
	//A a3 = new A("문자열");
	B b; // ok -> B클래스는 접근제한자가 public로 되어 있어서 다른 패키지에서도 사용이 가능
}
