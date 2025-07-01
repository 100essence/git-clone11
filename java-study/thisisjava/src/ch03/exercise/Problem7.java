package ch03.exercise;

public class Problem7 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;   // NaN
		if (Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다");
		}
	}
}
