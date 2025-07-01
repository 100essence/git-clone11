package ch12.sec12;

@AnnotationName(value = "값0")   // 어노테이션 사용
public class ClassName {

	@AnnotationName(value = "필드1")
	private String field1;
	
	@AnnotationName(value = "생성자1")
	public ClassName() {
		
	}
	
	@AnnotationName(value = "메소드1")
	public void method1() {
		
	}
}
