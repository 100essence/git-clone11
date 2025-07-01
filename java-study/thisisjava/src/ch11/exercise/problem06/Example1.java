package ch11.exercise.problem06;

public class Example1 {
	public static void main(String[] args) {
		String[] array = {"10", "2a"};	
		int value = 0;
		
		for(int i = 0; i <= array.length; i++) {
			try {
				// 예외가 발생할 수 있는 조건
				//  1. array[1]일 때 NumberFormatException -> 먼저 예외 발생
				//  2. i가 2일때 ArrayIndexOutOfBoundsException -> 두번째로 예외 발생
				value = Integer.parseInt(array[i]);  
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
			} finally {
				System.out.println(value);
			}
		}
	}
}
