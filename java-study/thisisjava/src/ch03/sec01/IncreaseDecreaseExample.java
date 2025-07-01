package ch03.sec01;

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		x++;
		++x;
		y--;
		--y;
		
		System.out.println("x: " + x);   // 3
		System.out.println("y: " + y);   // -1
		
		int result1 = ++x + 10;   // result1: 3 + 1 + 10 -> 14, x: 4		
		// 계산순서: 1. x = x + 1    2. result1 = x + 10
		int result2 = y++ + 10;   // result2: -1 + 10 -> 9, y: 0
		// 계산순서: 1. result2 = y + 10    2. y = y + 1
		
		System.out.println("result1: " + result1);   // 14
		System.out.println("result2: " + result2);   // 9
	}

}
