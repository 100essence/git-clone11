package ch03.exercise;

public class Problem5 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		// 사다리꼴 넓이 구하는 공식: (윗변 + 밑변) * 높이 / 2
		double area1 = (double)(lengthTop + lengthBottom) * height / 2;
		double area2 = (lengthTop + lengthBottom) * height / 2.0;
		double area3 = (lengthTop + lengthBottom) * (double)height / 2;
		double area4 = (lengthTop + lengthBottom) * height / (double)2;
		double area5 = ((double)lengthTop + lengthBottom) * height / 2;
		double area6 = (lengthTop + (double)lengthBottom) * height / 2;
		double area7 = (lengthTop + lengthBottom) * 1.0 * height / 2;
		double area8 = (lengthTop + lengthBottom + 1.0 - 1.0) * height / 2;
		double area9 = (double)((lengthTop + lengthBottom) * height / 2);
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
		System.out.println(area5);
		System.out.println(area6);
		System.out.println(area7);
		System.out.println(area8);
		System.out.println(area9);  // 52.0
	}

}
