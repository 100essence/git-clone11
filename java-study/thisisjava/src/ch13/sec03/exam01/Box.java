package ch13.sec03.exam01;

// 제너릭 클래스
public class Box<T> {
	private T t;
	private String s1;

	// Getter 메소드
	public T getT() {
		return t;
	}
	
	// Setter 메소드
	public void setT(T t) {
		this.t = t;
	}
}
