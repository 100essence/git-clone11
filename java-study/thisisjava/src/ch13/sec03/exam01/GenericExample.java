package ch13.sec03.exam01;

public class GenericExample<A> {
	private A a;
	private static String s = "";
	
	// 제너릭 메소드
	static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.setT(t);
		
		return box;
	}
	
	// 제너릭 메소드
	static <T1> T1 boxing2(T1 t1) {
		return t1;
	}
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(new Integer(100));
		int intValue = box1.getT();
		System.out.println(intValue);

		Box<String> box2 = boxing(new String("100"));
		String strValue = box2.getT();
		System.out.println(strValue);
	}

}
