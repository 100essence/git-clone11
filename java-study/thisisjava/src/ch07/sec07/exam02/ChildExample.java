package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {	
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		Parent parent = child;  // 클래스 자동 타입 변환
		parent.method1(); // child에 method1이 없기 때문에 parent에 있는 method1이 호출
		parent.method2(); // parent에 있는 메소드가 아닌 child의 메소드가 실행
		//parent.method3(); // parent에 method3이 없기 때문에 호출 불가능
	}
}
