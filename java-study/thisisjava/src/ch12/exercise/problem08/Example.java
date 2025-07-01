package ch12.exercise.problem08;

public class Example {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		// 프로그램 시작
		int[] scores = new int[1000];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}

		double avg = sum / scores.length;
		System.out.println(avg);
		// 프로그램 마침
		
		long end = System.currentTimeMillis();
		System.out.println(end - start + " milli second");
	}

}
