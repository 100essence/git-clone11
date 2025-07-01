package ch06.sec10.exam03;

public class ClassName {
	// 인스턴스 필드
	int a;
	
	// 인스턴스 메소드
	void method2() {
		
	}
	
	// 정적 메소드
	static void method1() { 
		//a = 0;	// error
		
		// 객체 생성
		ClassName classname = new ClassName();
		// 인스턴스 멤버들(필드, 메소드) 사용
		classname.a = 0;
		classname.method2();
	}
	
	// 정적 블록
	static {
		//a = 0;
	}
}
