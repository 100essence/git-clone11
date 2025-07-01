package ch12.sec12;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception {
		Service service1 = new Service();
		service1.method1();
		service1.method2();
		service1.method3();
		System.out.println();

		// 리플렉션을 사용해서 어노테이션 값들을 활용
		Method[] declaredMethod = Service.class.getDeclaredMethods();
		for(Method method : declaredMethod) {
			Annotation[] annoList = method.getAnnotations();
			PrintAnnotation printAnnotation 
				= method.getAnnotation(PrintAnnotation.class);
			method.invoke(service1);
			
			System.out.println("print annotation의 number: " + printAnnotation.number());
			System.out.println("print annotation의 value: " + printAnnotation.value());
		}
	}
}
