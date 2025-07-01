package ch12.sec12;

//@PrintAnnotation  // error(target에 TYPE이 없음)
public class Service {
	@PrintAnnotation 		// value 속성 기본값 "-" 사용
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")  // value만 속성 지정
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value = "#", number = 20)  // value #, number 20으로 속성값 변경
	public void method3() {
		System.out.println("실행 내용3");
	}
}
