package ch05.sec08;

public class ObjectArrayExample {
	public static void main(String[] args) {
		// 객체를 참조하는 배열(배열인데... 객체를 참조한다?) -> 배열은 객체이다...
		String a; // object -> object type
		int[] b; // object -> object type
		int c;  // short, double, boolean... -> primitive type
		String[] language = new String[3];  // object -> object type
		language[0] = "Java";    
		language[1] = "Java";
		language[2] = new String("Java");  // 객체 참조
		
		System.out.println(language[0] == language[1]);		// true. new하지 않은 것들은 같은 객체를 참조(equals, hashcode값이 같은 경우 같은 객체)
		System.out.println(language[0] == language[2]);     // false. new한거와 new하지 않은 것들은 서로 다른 객체를 가짐
		System.out.println(language[0].equals(language[2]));// true. 객체를 가지고 비교하지 않고 문자열 값으로 비교
		
		System.out.println(language[0].hashCode());
		System.out.println(language[1].hashCode());
		System.out.println(language[2].hashCode());
	}
}
