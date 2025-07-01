package ch05.sec04;

import java.util.Objects;

public class NullExample {

	int d;  // 멤버변수(필드)
	
	static void printItem() {
		System.out.println("");
		
		String a = "";
		int b = 0;
	}
	
	public static void main(String[] args) {
		// 참조타입의 null사용
		//int a = null;			// primitive type은 null이 안됨
		int[] arr1 = null;		// reference type은 null이 됨
		
		String refVar1 = "자바";
		String refVar2 = null;
		
		System.out.println(refVar1 == null);  // false
		System.out.println(Objects.isNull(refVar1)); // false
		System.out.println(refVar2 == null);  // true
		System.out.println(Objects.isNull(refVar2)); // true
		
		// null pointer exception
		//int[] intArray = null;
		//intArray[0] = 10;   // exception -> nullpointerexception 할당하지 않은 공간에 값을 넣으려고 할 때 발생
		String str = null;
		System.out.println("총 문자 수: " + str.length());  // exception-> nullpointerexception null이면서 값이 없는 상태에서 메소드 호출
	}

	
}
