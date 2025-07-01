package ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};	
		
		for(int i = 0; i <= array.length; i++) {
			try {
				// 예외가 발생할 수 있는 조건
				//  1. array[1]일 때 NumberFormatException -> 먼저 예외 발생
				//  2. i가 2일때 ArrayIndexOutOfBoundsException -> 두번째로 예외 발생
				int value = Integer.parseInt(array[i]);  
				
				System.out.println("array[" + i + "]: " + value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			}
		}
	}
}
