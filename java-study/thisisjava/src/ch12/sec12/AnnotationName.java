package ch12.sec12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션 선언(클래스, 인터페이스, 열거형, 필드, 생성자, 메소드만 어노테이션 사용 가능)
@Target({ 
	ElementType.TYPE, 
	ElementType.FIELD, 
	ElementType.CONSTRUCTOR,
	ElementType.METHOD })
// 어노테이션 유지 정책(RUNTIME을 사용하여 가장 오랫동안 유지시키도록 하는 것이 일반적)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationName {
	String value();
 }
