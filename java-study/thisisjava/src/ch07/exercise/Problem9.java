package ch07.exercise;

class A {
	
}

class B extends A {
	
}

class C extends A {
	
}

class D extends B {
	
}

class E extends B {
	
}

class F extends C {
	
}

public class Problem9 {
	public void method1() {
		B b1 = new D();
		B b2 = new E();
		B b3 = new B();
		B b4 = (B)new A();
		//B b5 = new C();
		
		method(b4);
	}
	
	void method(B b) {
		
	}
}
