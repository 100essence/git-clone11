package ch03.sec04;

public class OperationAccurationExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;  
		int pieceUnit10 = (int)(pieceUnit * 10);  // 소수로 된 걸 정수로 변환을 하기 위해 10을 곱함
		int totalPieces = apple * 10;
		int number = 7;
		
		double resultTotalPieces = (totalPieces - number) / 10.0;   // apple의 값을 변환해서 처리(책 기준)
		System.out.printf("%.2f\n", resultTotalPieces);
		
		double result = apple - ((pieceUnit10 * number) / 10.0);    // pieceUnit의 값을 변환해서 처리
		System.out.printf("%.2f\n", result);
		
		result = apple - (pieceUnit * number);   //  1 - (0.1 * 7) = 0.3 ???
		System.out.println(result);
		System.out.println(1 - (0.1 * 7));
		
		double a = 1.0;
		double b = 0.1;
		double c = 7.0;
		
		double d = b * c;
		System.out.println(d);
		
	}

}
