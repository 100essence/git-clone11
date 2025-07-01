package ch06.sec08.exam01;

//메소드만 선언된 클래스(메소드 5개)
public class Calculator {
	//리턴값이 없는 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	//호출시 두 정수 값을 전달 받고,	
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	int plus(int x, int y) {
		int result = x + y;
		return result;   //리턴값 지정;
	}
	int plus(int x, int y, int z) {
		int result = x + y + z;
		return result;   //리턴값 지정;
	}
	double plus(double x, double y) {
		return x + y;
	}
	
	//호출시 두 정수 값을 전달 받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;   //리턴값 지정;
	}
	
	// 리턴값 1인 정수형 메소드 선언
	int simple1() {
		return 1;
	}
	
	// 내부 메소드 호출하는 메소드
	void method1() {
		int a = simple1();   // 내부 메소드 호출(인스턴스 변수 필요하지 않음))
		int b = simple1();
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	
	
	
	
	
	
	
}
