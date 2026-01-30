package kr.com.koreait;

import java.util.Arrays;

public class Ex16_Varargs {

	public static void main(String[] args) {

		// 가변길이 매개변수
		// - 매개변수의 개수를 유동적으로 받는 방식
		// - 특징 : 배열로 받음 
		// - 사용 방법 : 자료형 . . .
		// - 주의 사항 1 : 가변길이 매개변수는 마짐가에 작성되어야 한다.
		// - 주의 사항 2 : 가변길이 매개변수가 작성된 오버로딩은 우선 순위가 낮음
		//		> 오버로딩은 시그니처가 가장 정확히 일치하는 메서드를 우선 호출 
		
		Ex16_Varargs v = new Ex16_Varargs();
//		v.printNumber();
		v.printNumber(1);
		v.printNumber(1,2,3);
		
	}
//	
//	public void printNumber(int num, int num2) {       
//		System.out.println("매개변수 num : " + num);
//		System.out.println("가변길이 매개변수 :" + Arrays.toString(numbers)); 
//		
//	}
//	
	public void printNumber(int num, int... numbers) {       // 가변길이 매개변수는 무조건 뒤에 있어야함 
		System.out.println("매개변수 num : " + num);
		System.out.println("가변길이 매개변수 :" + Arrays.toString(numbers)); //  배열 형태로 들어오며 하나씩 뽑고 싶으면 for문으로 뽑아써야함
		
	}
	
	

}
