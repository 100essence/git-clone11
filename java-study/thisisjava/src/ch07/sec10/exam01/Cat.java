package ch07.sec10.exam01;

// abstract클래스를 상속받은 클래스는 abstract로 된 메소드를 무조건 모두 구현
public class Cat extends Animal {
	public Cat() {
		//breathe();
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
