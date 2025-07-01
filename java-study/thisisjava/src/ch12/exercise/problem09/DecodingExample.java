package ch12.exercise.problem09;

public class DecodingExample {

	public static void main(String[] args) throws Exception {
		byte[] bytes= {-20, -107, -120, -21, -123, -107};
		String str = new String(bytes, "utf-8");
		System.out.println("str: " + str);
	}

}
