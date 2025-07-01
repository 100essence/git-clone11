package ch04.sec04;

public class InfinityForExample {

	public static void main(String[] args) {
		// for 무한 루프(조건식에서 아무것도 없거나 무조건 true일 경우)
		int i = 0;
		int j = 0;
		for (;;) {
			System.out.println("i: " + i++);
			if (i == 5)
				continue;
			
			System.out.println("j: " + j++);
			if (i == 7)
				break;
		}

	}

}
