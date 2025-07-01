package ch06.sec10.exam02;

// static block(정적 블록) 예제
public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info = company + " " + model;
	
	// 정적블록 -> 클래스가 메모리로 자동으로 로딩될 때 실행(프로그램 실행시 1번만 실행)
	static {
		model = "LED";
		info = company + " " + model;
		
		System.out.println("static 정적 블록 실행");
	}
	// 일반 메소드 블록 -> 클래스 객체 new호출되고 method()가 호출될 때 실행
	String method() {
		info = company + " " + model;
		
		return info;
	}
}
