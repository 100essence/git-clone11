package ch03.sec02;

public class ArthOperationExample {

	public static void main(String[] args) {
		// +(덧셈), -(뺄셈), *(곱셈), /(나눗셈), %(나머지)
		int a = 10;
		int b = 3;
		int c = a % b;   //  10 / 3 = 3 * 3 + 1 -> 1
		System.out.println(c);  // 1
	}

}
