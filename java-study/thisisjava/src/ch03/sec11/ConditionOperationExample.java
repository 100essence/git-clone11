package ch03.sec11;

public class ConditionOperationExample {

	public static void main(String[] args) {
		// 삼항조건 연산자 ->  조건식 ? 조건식일 true일 경우 실행 : 조건식이 false일 경우 실행
		
	    // 주민등록번호 뒷자리 7자리 중에서 첫째자리에 따라 남,여 구분이 가능한데
		int jumin2 = 2234567;
		//System.out.println(jumin2 / 1000000);  // 1
		
		int genderValue = (jumin2 / 1000000) % 2;  // 나머지 1이면 남자이고 나머지가 0이면 여자
		String gender = genderValue == 1 ? "남자" : "여자";
		
		System.out.printf("해당 주민등록번호의 성별은 %s", gender);
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
