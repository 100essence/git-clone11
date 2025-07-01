package ch03.sec06;

public class CompareExample1 {

	public static void main(String[] args) {
		// 비교 연산자
		//   - 같다 -> '=='
		//   - 다르다 -> '!='
		//   - ~보다 크다 -> '>'
		//   - ~보다 작다 -> '<'
		//   - ~보다 같거나 크다 -> '>='
		//   - ~보다 같거나 작다 -> '<='

		// String의 동등 비교시에는 equals를 사용
		String str1 = "Java";
		String str2 = "자바";
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
	}

}
