package ch02.sec08;

public class CastingExample1 {

	public static void main(String[] args) {
		int intValue = 10;
		// int -> byte
		byte byteValue = (byte) intValue;	
		System.out.println(byteValue);
		
		// long -> int
		long longValue = 300;
		int intValue2 = (int)longValue;
		System.out.println(intValue2);
		
		// long -> short
		short shortValue = (short)longValue;
		System.out.println(shortValue);
		
		// int -> char
		int intValue3 = 65;
		char charValue = (char)intValue3;  // 'A'
		System.out.println(charValue);
		
		// double, float -> long, int, short, byte(실수 -> 정수)
		double doubleValue = 3.14;
		int intValue4 = (int)doubleValue; // 3 (소수점은 버림)
		System.out.println(intValue4);
	}

}
