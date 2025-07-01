package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car k5 = new Car("k5", "흰색", 220);
		
		// 수동으로 만든 생성자가 있다면 기본 생성자(파라미터가 없는)를 만들지 못함
		//Car k3 = new Car(); // error
	}

}
