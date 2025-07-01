package ch02.sec02;

public class VariableType1 {

	public static void main(String[] args) {
		byte a = 120;  // -128 ~ 127 (256개)
		byte b = -128;

		short c = 32767;  // -32768 ~ 32767 (65536개)
		short d = 20000;
		
		char e = 1;		  // 0 ~ 65535 (65536개)
		char f = 2;
		
		int h = 3;		// 약 -21억 ~ 21억 (약 42억개)
		
		// 2진수(앞에 0b)(0~1)
		int x1 = 0b1011;   // 2진수 1011 -> 10진수 11
		// 8진수(앞에 0)(0~7)
		int x2 = 013;   // 8진수 13 -> 10진수 11
		// 16진수(앞에 0x)(0~F)(0 ~ 9,A,B,C,D,E,F)
		int x3 = 0xB3;   // 16진수 B3 -> 10진수 179
	}

}
