package ch07.sec10.exam01;

// abstract 클래스
public abstract class Animal {
	// abstract로 만든 클래스는 메소드도 abstract 선언을 해서 사용
	// 추상메소드는 실제 실행문을 만들지 않고 메소드 선언만 가능
	protected abstract void sound();
	
	// 일반메소드는 실행문 사용 가능
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
}
