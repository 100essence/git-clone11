package ch07.sec04.exam01;

import ch07.sec04.exam02.Airplane;

public class Calculator extends Airplane {
	//메소드 선언
	public double areaCircle(double r) { 
		System.out.println("Calculator 객체의 arearCircle() 실행");
		return 3.14159 * r * r; 
	}
}
