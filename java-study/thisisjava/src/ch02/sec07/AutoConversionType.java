package ch02.sec07;

public class AutoConversionType {

	public static void main(String[] args) {
		int a = 1;
		long b = a;   // 자동 타입 변환
		
		long longValue = 5000000000L;
		float floatValue = longValue;  // 자동 타입 변환
		double doubleValue = longValue;// 자동 타입 변환
		
		System.out.println(floatValue);
		System.out.println(doubleValue);
		
		char charValue = 'A';
		int intValue = charValue;  // 숫자로 자동 타입 변환(65)
		System.out.println(intValue);
		
		// 예외: char 타입보다 허용 범위가 작은 byte 타입은 char 타입으로 자동 변환될 수 없음
		byte byteValue2 = 65;
		//char charValue2 = byteValue2; // 예외 케이스에 해당되어 컴파일 에러
	}

}
