package ch07.sec07.exam01;

class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}


public class PromotionExample {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = new D();
		C c1 = new E();
		
		//B b2 = new E();  // error -> 아무런 관계 없음
		//C c2 = new D();	 // error -> 아무런 관계 없음
	}
}
