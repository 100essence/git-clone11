package ch07.sec04.exam00;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();   // Parent method1() 실행
		child.method2();   // Child method2() 실행
		child.method3();   // Child method3() 실행
	}

}
