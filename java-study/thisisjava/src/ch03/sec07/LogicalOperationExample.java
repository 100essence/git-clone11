package ch03.sec07;

public class LogicalOperationExample {

	public static void main(String[] args) {
		// AND(&&, &), OR(||, |), NOT(!) 연산자
		// AND(&&)(논리곱): 피연산자들이 모두 true일 경우 결과는 true
		/*
			true && true -> true
			true && false -> false
			false && true -> false
			false && false -> false
			
			true & true -> true
			true & false -> false
			false & true -> false
			false & false -> false
		*/
		int age = 22;
		boolean result = age >= 10 && age <= 19;
		
		// OR(||)(논리합): 피연산들 중 하나 이상이 true일 경우 결과는 true
		/*
		   true || true -> true 
		   true || false -> true
		   false || true -> true
		   false || false -> false
		   
		   true | true -> true 
		   true | false -> true
		   false | true -> true
		   false | false -> false
		*/
		
	}

}
