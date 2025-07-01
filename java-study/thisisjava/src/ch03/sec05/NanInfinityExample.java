package ch03.sec05;

public class NanInfinityExample {

	public static void main(String[] args) {
		// NaN(Not a Number)
		boolean result1 = Double.isNaN(1.1);    // 1.1이 숫자가 아니면 true, 숫자이면 false
		System.out.println(result1);  // false
		
		double dbl1 = 3 % 0.0;   // 나머지가 NaN
		boolean result2 = Double.isNaN(dbl1);
		System.out.println(result2);  // true
		
		//int a = Integer.parseInt("일");  // NaN -> NumberFormatException
		
		// Infinity(값이 무한대) -> 0으로 나누었을 때 발생
		double a = 3 / 0;   // Infinity
		boolean result3 = Double.isInfinite(a);
		System.out.println(result3);  // true		
	}

}
