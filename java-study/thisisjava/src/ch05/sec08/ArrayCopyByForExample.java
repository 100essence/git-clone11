package ch05.sec08;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// 배열 복사(array copy) -> 가장 원시적인 방법
		int[] oldIntArray = {1, 2, 3}; // 길이가 3인 배열
		int[] newIntArray = new int[5]; // 길이가 5인 배열. 초기값은 0
		
		//배열 항목 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		//배열 항목 출력
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		System.out.println();
		
		// 배열 복사(array copy) -> System.arraycopy를 이용하는 방법
		//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		//배열 항목 복사
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		System.out.println();
		
		// oldIntArray를 System.arraycopy를 이용해서 newIntArray에 복사하기
		System.arraycopy( oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}

}
