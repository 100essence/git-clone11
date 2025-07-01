package ch06.sec07.exam00;

public class CarExample {

	public static void main(String[] args) {
		Car santefe = new Car();  // Car의 생성자(constructor) 호출

		// 생성자가 호출되어 speed의 값이 변경
		System.out.println(santefe.speed);  // 0?  1? -> 1
	}

}
