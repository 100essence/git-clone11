package ch07.sec07.exam03;

import ch07.sec07.exam00.Animal;

public class ChildExample {
	public static void main(String[] args) {
		// 자동 타입 변환
		Parent parent = new Child();  // field2과 method3은 사용 불가능
		//parent.field2 = "aaa";  // field2은 child에 있기 때문에 불가능
		//parent.method3();		// method3은 child에 있기 때문에 불가능
		
		parent.field1 = "aaa";
		parent.method1();
		parent.method2();
		
		boolean result0 = parent instanceof Parent;
		System.out.println("result0: " + result0); // true
		boolean result1 = parent instanceof Child;
		System.out.println("result1: " + result1); // true
		
		// 강제 타입 변환
		Child child = (Child) parent;
		child.field2 = "aaa"; 
		child.method3(); 
		
		boolean result2 = child instanceof Parent;
		System.out.println("result2: " + result2); // true
		boolean result3 = child instanceof Child;
		System.out.println("result3: " + result3); // true
		
		//boolean result4 = child instanceof Animal;
	}

}
