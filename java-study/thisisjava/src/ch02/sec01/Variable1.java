package ch02.sec01;

public class Variable1 {

	public static void main(String[] args) {	
		int age;
		double value;
		
		int score;  // 변수 선언(1)
		score = 90;	// 변수 값 대입(2)
		
		int score2 = 90;  // 변수 선언과 동시에 값 대입?((1) + (2))
		
		age = 25;
		value = 10.0;
		
		System.out.println(score);
		System.out.println(age);
		System.out.println(value);
		
		int value2 = 30;
		int result = value2 + 10;
		
		int x = 10;
		int y = x;
	}

}
