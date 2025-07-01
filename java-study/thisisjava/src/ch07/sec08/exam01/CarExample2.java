package ch07.sec08.exam01;

public class CarExample2 {

	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		
		//Tire 객체 장착
		myCar.tire1 = new Tire();
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.tire1 = new HankookTire();
		myCar.run();
		
		//KumhoTire 객체 장착
		myCar.tire1 = new KumhoTire();
		myCar.run();

	}

}
