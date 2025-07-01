package ch11.sec05;

public class ThrowsExample1 {
	public static void main(String[] args) throws Throwable {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리(ClassNotFoundException): " + e.getMessage());
			
			throw e;
		} catch(Exception e) {
			System.out.println("예외 처리(Exception): " + e.getMessage());
		}
		
		Class.forName("aaaa");
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");	// 예외 발생
	}
}
