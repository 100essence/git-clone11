package ch07.sec08.exam01;

public class Car {
	Tire tire1;
	//HankookTire hankookTire1;
	//KumhoTire kumhoTire1;
	
	public void roll() {
		this.tire1.roll();
		// 그 이후에 핸들 조정하는 실행문 같은 추가 가능
	}
	public void run() {
		this.tire1.roll();
		// 그 이후에 핸들 조정하는 실행문 같은 추가 가능
	}
}
