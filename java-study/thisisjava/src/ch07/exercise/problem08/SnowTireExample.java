package ch07.exercise.problem08;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
//		Tire tire = new SnowTire();
		
		snowTire.run();	// 스노우타이어가 굴러갑니다.
		tire.run();		// 스노우타이어가 굴러갑니다.
		tire.run();		// 스노우타이어가 굴러갑니다.
	}
}
