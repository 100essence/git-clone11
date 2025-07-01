package ch05.sec05;

public class StringExample2 {

	public static void main(String[] args) {
		// 문자열 연산(메소드 활용)
		//   - 비교(equals)
		//   - 추출(charAt);
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(2);
		System.out.println(charValue);
		
		// 주민등록번호에 1개 숫자 가져오기
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2', '4':
			System.out.println("여자입니다");
			break;
		}
		//   - 길이(length)
		System.out.println(subject.length());  // 8
		System.out.println(ssn.length());  // 13
		
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
		//   - 대체(replace, replaceAll)
		String oldStr = "자바 프로그래밍 자바";
		String newStr = oldStr.replace("자바", "Java"); // 앞에 파라미터 찾을 문자, 뒤에 파라미터 찾을 문자에서 바꾸어야할 문자
		System.out.println(newStr);  // Java 프로그래밍 Java
		String newStr2 = oldStr.replaceAll("프.{3}밍", "Java"); // 앞에 파라미터 찾을 문자를 정규표현식이 가능
		System.out.println(newStr2);  // 자바 Java 자바
		
		//   - 잘라내기(substring)
		String firstNum = ssn.substring(0, 6);  // 시작인덱스가 0인 거부터해서 인덱스 5까지인 문자열 가져오기
		System.out.println(firstNum);		 // 950624
		String secondNum = ssn.substring(6); // 인덱스가 6인거부터해서 끝까지 문자열 가져오기
		System.out.println(secondNum);
		
		//   - 찾기(indexOf(리턴값이 정수), contains(리턴값이 boolean))
		// indexOf
		int location = subject.indexOf("프로그래밍");   // "프로그래밍"글자가 나오기까지의 처음 인덱스 번호를 반환함  
		System.out.println(location);	// 3
		String substring = subject.substring(location); // 프로그래밍 자바
		System.out.println(substring);
		
		location = subject.indexOf("가나다");		// 찾을 문자열이 없다면 -1을 반환
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		// contains
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		//   - 분리(split)
		String board = "번호,제목,내용,성명";
		String[] arr = board.split(",");  // arr[0]: 번호, arr[1]: 제목, arr[2]: 내용, arr[3]: 성명
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
