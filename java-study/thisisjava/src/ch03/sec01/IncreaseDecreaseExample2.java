package ch03.sec01;

public class IncreaseDecreaseExample2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;    // 11 
		++x;    // 12
		System.out.println("x=" + x);   //  x=12		

		System.out.println("-----------------------");		
		y--;    // 9
		--y;    // 8
		System.out.println("y=" + y);     // y=8		

		System.out.println("-----------------------");		
		z = x++; // z=12   , x=12
		// 계산순서: 1. z = 12,    2. x = 13
		System.out.println("z=" + z);  // 12
		System.out.println("x=" + x);  // 13
		
		System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z);  // 14
		System.out.println("x=" + x);  // 14
		
		System.out.println("-----------------------");				
		z = ++x + y++;
		// 계산순서: 1. x = x + 1,    2. z = 15(x) + 8(y)     3. y = y + 1
		System.out.println("z=" + z);   // 23
		System.out.println("x=" + x);   // 15
		System.out.println("y=" + y);   // 9
		
		System.out.println("-----------------------");
		int a = 10;
		int b = 20;
		int c = (++a) + (b--);
		// 계산순서: 1. a = a + 1,    2. c = a + b,     3. b = b - 1
		// 31 = 11 + 20
		System.out.println(c); // 31
		System.out.println("a: " + a); // 11
		System.out.println("b: " + b); // 19
	}

}
