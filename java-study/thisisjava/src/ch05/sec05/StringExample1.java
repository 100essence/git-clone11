package ch05.sec05;

public class StringExample1 {

	public static void main(String[] args) {
		// 1. 문자열 비교(==, !=)
		String name1 = "홍길동";
		String name2 = "홍길동";
		if (name1 == name2)			// true
			System.out.println("name1과 name2의 참조가 같다");	// 출력
		else
			System.out.println("name1과 name2의 참조가 다르다");
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		if (name3 == name4)			// false
			System.out.println("name3과 name4의 참조가 같다");
		else
			System.out.println("name3과 name4의 참조가 다르다");  // 출력
		
		if(name1.equals(name2)) { System.out.println("name1과 name2의 값이 같다."); }  // 출력
		if(name3.equals(name4)) { System.out.println("name3과 name4의 값이 같다."); }  // 출력
	}

}
