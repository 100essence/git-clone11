package ch02.sec03;

public class CharExample1 {

	public static void main(String[] args) {
		// 문자타입
		char a = 1;
		char b = 'a';
		
		char var1 = 'A';   // 'A'는 유니코드 혹은 아스키코드 표 안에 숫자
		char var2 = '가';   // '가'는 유니코드 표 안에 숫자
		System.out.println(var1);
		System.out.println(var2);
		
		char c1 = 65;
		char c2 = 0x0041;
		// char 10진수 65는 아스키코드 표 안의 숫자와 대응하는 문자
		System.out.println(c1); 
		// char 16진수 0041은 유니코드 표 안의 숫자와 대응하는 문자
		System.out.println(c2);
		
		char c3 = 97;
		System.out.println(c3);
	}

}
