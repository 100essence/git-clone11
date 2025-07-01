package ch08.sec10.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		
		a = b;	// A <- B 자동타입변환
		a = c;  // A <- C 자동타입변환 
		a = d;  // A <- D 자동타입변환
		a = e;  // A <- E 자동타입변환
	}

}
