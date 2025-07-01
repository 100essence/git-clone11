package ch07.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {						// 에러 아님(speed는 일반메소드)
		speed += 10;
	}

	// 오버라이딩을 할 수 없음
//	@Override
//	public void stop() {						// 에러(stop은 final메소드)
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
