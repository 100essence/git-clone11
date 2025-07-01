package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
		// 대입연산자(+=, -=, *=, /=, %=)
		int x = 1;
		x += 1;   // x = x + 1
		
		int y = 1;
		y -= 1;	  // y = y - 1
		
		int z = 1;
		z *= 1;   // z = z * 1
		
		int a = 1;
		a /= 1;   // a = a / 1
		
		int b = 1;
		b %= 1;   // b = b % 1
		
		
		int result = 0;		
		result += 10;
		System.out.println("result=" + result);		
		result -= 5;
		System.out.println("result=" + result);		
		result *= 3;
		System.out.println("result=" + result);		
		result /= 5;
		System.out.println("result=" + result);		
		result %= 3;
		System.out.println("result=" + result);	
	}

}
