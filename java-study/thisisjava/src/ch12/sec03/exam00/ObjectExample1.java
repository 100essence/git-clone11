package ch12.sec03.exam00;

public class ObjectExample1 extends Object {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = obj1;
		
		boolean result1 = obj1.equals(obj2); // true
		boolean result2 = (obj1 == obj2);	 // true
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}

}
