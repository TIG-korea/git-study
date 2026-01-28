package kr.com.training;

import java.util.Scanner;

public class Ex02_for {

	public static void main(String[] args) {
		
		// 1. 짝수를 출력하는 for문
		// - 범위는 : 1~20
		// - 해당 범위안에 있는 짝수만 출력
		Scanner sc = new Scanner(System.in);

		

		for(int i=1; i<21; i++) {
			if (i % 2 == 0 ) {
				System.out.println(i);
			}
	}
		
		
		
		
		
		// 2. 3과 5의 공배수를 출력하는 for문    99 % 3 = 0   <- 3의 배수
		// - 범위 : 1~100 				    15 % 5  = 0  <- 5의 배수 둘 다 true인 것들만
		
		
		for(int i=1; i<101; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		// 3. 10 팩토리얼의 값을 출력하는 for문
		// - 10 팩토리얼 = 10!
		// - 값 : 3628800
		
		int factorial =1;    // 곱하는거라 0은 불가 
		
		for(int i=1; i<11; i++) {
			factorial = factorial * i;
		}
		
		System.out.println(factorial);
		
		
		
		
		
		
		// 4. 아래의  별찍기를 구현하세요. (이중 for문)
		//  *
		//	**
		//	***
		//	****
		//	*****
		int height = 5;
		
		for(int i=0; i<height; i++) {
			
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		// 2단부터 9단까지 출력하는 구구단 프로그램 만들기 
		// - 출력값 : "2*1=2"  "2*2=4" .... "2*9=18"
		
		 for(int i = 2; i<10; i++) {
		 System.out.print(i);
			 
			 for(int j=1; j<10; j++) {
				 System.out.print("*"+ j + "=" + i*j );
			 }
			 
			System.out.println();
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
