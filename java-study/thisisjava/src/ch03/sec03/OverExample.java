package ch03.sec03;

public class OverExample {

	public static void main(String[] args) {
		byte value1 = 127;
		value1 = (byte)(value1 + 1); // overflow 
		System.out.println(value1);
		
		byte value2 = -128;
		value2 = (byte)(value2 - 1); // underflow 
		System.out.println(value2);
		
		// short타입에 대한 overflow, underflow 
		
	}

}
