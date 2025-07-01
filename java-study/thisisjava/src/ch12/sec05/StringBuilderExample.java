package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString()
				;
		
//		data.append("DEF");
//		data.insert(0, "ABC");
//		data.delete(3, 4);
		
		System.out.println(data);
		
		byte a1 = 10;
		Byte a2 = 10;  // byte인 숫자 10을 포장 클래스 a2 인스턴스 변수 대입하는 것이 박싱(boxing)
		byte a3 = a2;  // 포장 클래스로 된 변수를 기본 타입 변경하는 것은 언박싱(unboxing)
		byte a4 = a2.byteValue();
		byte a5 = Byte.parseByte("1");
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		if (obj1 == obj2) { // false(객체 값의 주소값을 비교)
			
		}
		if (obj1.intValue() == obj2.intValue()) { // true(기본 원시값을 비교)
			
		}
		if (obj1.equals(obj2)) { // true(기본 원시값을 비교)
			
		}
	}

}
