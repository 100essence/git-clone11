package ch06.sec08.exam03;

public class Car {
	// return문 예제
	
	//필드 선언
	int gas;
	String model;
	int speed;

	Car() {
		
	}
	Car(String model) {
		this.model = model;
	}
	//리턴값이 없는 메소드로 	매개값을 받아서 gas 필드값을 변경
	void setGas(int gas) {
		this.gas = gas;
	}
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴하고 메소드 종료
			
			//System.out.println("Hello");
		}
		
		System.out.println("gas가 있습니다");
		return true;	// true를 리턴하고 메소드 종료
	}
	
	//리턴값이 없는 메소드로 gas 필드값이 0이면 return문으로 메소드를 종료
	void run() throws Exception {
		while (true) {
			if (gas > 0) {
				Thread.sleep(800);  // 0.8초 잠깐 쉬고 다음 실행문 실행
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; // 메소드 종료
			}
		}
	}
}
