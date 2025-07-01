package ch02.sec10;

public class StringConversion {

	public static void main(String[] args) {
		/*
		 * 문자열을 기본타입으로 변환(parse~ 이용)
		 */
		String str1 = "10";
		byte value1 = Byte.parseByte(str1);   // 문자열 10을 byte타입의 숫자 10으로 저장
		System.out.println(value1);
		
		String str2 = "200";
		short value2 = Short.parseShort(str2);   // 문자열 200을 short타입의 숫자 200으로 저장
		System.out.println(value2);
		
		/*
		 * 기본타입을 문자열로 변환(String.valueOf를 이용)
		 */
		byte a = 10;
		String str10 = String.valueOf(a);		// byte타입의 숫자 10을 문자열 10으로 변환
		System.out.println(str10);				// 10
		
		short b = 10;
		String str11 = String.valueOf(b);		// short타입의 숫자 10을 문자열로 변환
		System.out.println(str11);				// 10
		
		byte byteValue = 10;
		float floatValue = 2.5f;
		double doubleValue = 2.5;
		
		double result = 5 + doubleValue;
		
	}

}
