package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car car0 = new Car();
		car0.tire1 = new Tire();
		car0.tire1.roll();			// 회전합니다.
		car0.roll();				// 회전합니다.
		
		Car car1 = new Car();
		car1.tire1 = new HankookTire();
		//car1.hankookTire1 = new HankookTire();
		//car1.kumhoTire1 = new KumhoTire();
		
		//car1.tire1.roll();		// 한국 타이어로 회전합니다.
		car1.roll();				// 한국 타이어로 회전합니다.
		
		Car car2 = new Car();
		car2.tire1 = new KumhoTire();
		//car2.tire1.roll();		// 금호 타이어로 회전합니다.
		car2.roll();				// 금호 타이어로 회전합니다.
	}

}
