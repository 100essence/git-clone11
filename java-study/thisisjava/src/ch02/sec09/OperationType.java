package ch02.sec09;

public class OperationType {

	public static void main(String[] args) {
		/*
		 * 정수끼리의 형변환
		 */
		byte result = 10 + 20;
		System.out.println(result);  // 30
		
		byte x = 10;
		byte y = 20;
		byte result2 = (byte)(x + y);  // 강제형변환
		//byte result2 = x + y;  // error???
		
		long result3 = x + y;  // 자동형변환 3번
		
		/*
		 * 실수끼리의 형변환 
		 */
		double result4 = 1.2f + 3.4;  // 1.2f가 double로 자동형변환
		
		/*
		 * 정수와 실수끼리의 형변환(+, -,  *)
		 */
		int a = 10;
		double b = 5.5;
		double result5 = a + b;
		
		int a1 = 10;
		double b1 = 5.5;
		int result6 = a1 + (int)b1;
		
		// 정수와 실수끼리의 형변환(/)
		int a2 = 1;
		int b2 = 2;
		double result7 = (double)a2 / (double)b2;
		System.out.println(result7);
		
		/*
		 * 정수,실수와 문자열을 '+'연산자와 같이 사용할 때(우선순위 문제)
		 */
		int a3 = 10 + 3 - 5;
		// 10 + 3 -> 13
		// 13 - 5 -> 8
		
		// 3 - 5 -> -2
		// 10 -2 -> 8
		
		int a4 = 10 * (3 - 5);
		// 10 * 3 -> 30
		// 30 - 5 -> 25
		
		// 3 - 5 -> -2
		// 10 * -2 -> -20
		
		int value1 = 3 + 7;  // 10
		String str1 = "3" + 7;   // 7 -> "7" 결과적으로 "37"
		String str2 = 3 + "7";   // 3 -> "3" 결과적으로 "37"
		
		int value2 = 1 + 2 + 3;  // 6
		String str3 = 1 + 2 + "3";  // 123?, 33? -> 33
		String str4 = 1 + "2" + 3;  // 123?, 33?, 24?, 15?: 1 -> "1"
		                            // "12" + 3 -> 123
		String str5 = "1" + 2 + 3;  // 2 -> "2", "12" + "3" -> 123
		String str6 = "1" + (2 + 3);  // 15
		
		
		
		
		
		
		
		
		
	}

}
