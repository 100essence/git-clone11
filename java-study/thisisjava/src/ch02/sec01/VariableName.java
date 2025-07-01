package ch02.sec01;

public class VariableName {

	public static void main(String[] args) {
		// 변수 이름 규칙
		//   - 1글자이상이면 가능
		//   - 한글도 가능. but 관례상 사용하지 않음
		//   - 숫자도 사용 가능. but 첫글자에는 불가능
		//   - 특수문자 '_', '$'
		//   - 대소문자 구별
		//   - 예약어(preserved keyword)는 사용 불가능
		int a;
		int A;
		int b;
		int 가;
		int ㄱㄴㄷ;
		//int 1a;	// error
		int a1;
		int a_1;
		int a$1;
		//int long;	// error
	}

}
