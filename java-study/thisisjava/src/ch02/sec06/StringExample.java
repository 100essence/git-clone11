package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		String str = "나는 \"자바\"를 배웁니다..";
		System.out.println(str);

		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
		System.out.println();
		// 문자열 블록 문법
		String a = """ 
				dsaf\n
				asdf
				asdf
		""";
		System.out.println(a);
		
		String b = """
옛날전화기 최저가는? 에누리 스마트한 쇼핑 솔루션 스마트한 업무 파트너
옛날전화기 찾는다면? 전화기, 무전기 최저가는 에누리에서 사자! 꼼꼼하게 가격비교하고 똑똑하게 쇼핑하자! 에누리 가격비교
		""";
		System.out.println(b);	
		
		String c = """
홍길동
프로그래머
나는 "자바"를 배웁니다..
번호	이름	직업 
나는
자바를
배웁니다.
""";
		
	}

}
