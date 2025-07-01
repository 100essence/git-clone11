package ch06.sec10.exam00;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int sum1 = cal.plus(1, 2);
		System.out.println(sum1);
		cal.setColor("red");
		
		int sum2 = Calculator.plus(1, 2);
		System.out.println(sum2);
		//Calculator.setColor("red");  // error -> setColor는 static메소드가 아님
	}

}
