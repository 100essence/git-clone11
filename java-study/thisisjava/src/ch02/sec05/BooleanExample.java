package ch02.sec05;

public class BooleanExample {

	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(true);
		System.out.println(false);
		System.out.println("tru");
		System.out.println("fals");
		
		System.out.println("--------------------------------------");
		int x = 10;
		boolean result = (x == 20);  // 변수 x의 값이 20이면 true 아니면 false
		System.out.println(result);	 // false
		result = (x != 20);  // 변수 x의 값이 20이 아니면 true 이면 false
		System.out.println(result);	 // true
	}

}
