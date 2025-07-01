package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println(var1);
		System.out.println(var2);

		//10의 거듭제곱 리터럴
		double var3 = 3e6;		// 3.0 * 10의 6승
		float var4 = 3e6f;      // 3.0 * 10의 6승의 float
		double var5 = 2e-3;		// 2.0 * 10의 마이너스 3승
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4); 
		System.out.println("var5: " + var5);
	}

}
