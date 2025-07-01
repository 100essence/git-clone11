package ch07.sec04.exam01;

public class Computer extends Calculator {
	//메소드 오버라이딩
	@Override	// 옵션
	public double areaCircle(double r) {
		super.areaCircle(r);
		
		System.out.println("Computer 객체의 arearCircle() 실행");
		return Math.PI * r * r;
	}
}
