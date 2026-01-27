package kr.com.training;

import java.util.Scanner;

public class Ex01_if문제 {

	public static void main(String[] args) {{
		
		
//		Q1. 점수를 입력받아 60점 이상이면 "합격", 아니면 "불합격" 출력
//
		int num = 60;
		if(num >= 60) {
			System.out.println("합격입니다");
			} else if (num < 60) {
			System.out.println("불합격입니다");
			}
			
		}
		
////		Q2. 정수 하나를 입력받아 짝수인지 홀수인지 출력
	Scanner sc = new Scanner(System.in);
//			int number;
			// number % 2 == 0
//			if(number = 1);

//
//		Q3. 나이를 입력받아 20세 이상이면 "성인", 아니면 "미성년자" 출력
//
			  int age = sc.nextInt();
			  if (age >= 20) {
		            System.out.println("성인입니다.");
			  } else {
				  System.out.println("미성년자입니다");
			  }
			
//		Q4. 비밀번호가 "1234"이면 "로그인 성공", 아니면 "로그인 실패" 출력
			 int num4 = 1234;
			 if (num4 == 1234) {
				 System.out.println("로그인 성공");
			 } else {
				 System.out.println("로그인 실패");
			 }
			   
//
//		Q7. 나이를 입력받아 요금 출력
//		 - 12세 이하 : 3,000원
//		 - 18세 이하 : 5,000원
//		 - 19세 이상 : 10,000원
//
			 int age1 = sc.nextInt();
			 if (age1 <= 12) {
				 System.out.println("3,000원 입니다");
			 } else if (age1 <= 18) {
				 System.out.println("5,000원 입니다");
			 } else {
				 System.out.println("10,000원 입니다");
			 }
			 
			 
//		Q8. 아이디와 비밀번호를 입력받아 아이디가 "admin"이고 비밀번호가 "1234"면 관리자 로그인 성공
//
			 String 아이디 = sc.nextLine();
			 int 비밀번호 = sc.nextInt();
			 
			 if ("admin".equals(아이디) && 비밀번호 == 1234) {
				 System.out.println("관리자 로그인 성공");
			 } else {
				 System.out.println("로그인 실패");
			 }
			 
//		Q9. 점수와 결석 여부를 입력받아 결과 출력 (스캐너로)
//		 - 결석 여부는 true, false로 받음
//		 - 결석이면 무조건 F
//		 - 90 이상 A
//		 - 80 이상 B
//		 - 70 이상 C
//		 - 그 외 F
			 System.out.println("점수");
			 int 점수 = sc.nextInt();
			 
			 System.out.println("결석여부");
			 boolean 결석여부 = sc.nextBoolean();
			 
			 if(결석여부) {
				 System.out.println("F입니다");
			 } else if (점수 >= 90) {
				 System.out.println("A");
			 } else if (점수 >= 80) {
				 System.out.println("B");
			 } else if (점수 >= 70) {
				 System.out.println("C");
			 } else {
				 System.out.println("f");
			 }
			 
//
//		Q10. 스캐너로 사용자로부터 몇 월인지 입력 받으세요.
//		  - 해당하는 계절과 출력 메시지는 아래와 같습니다.
//		  - 3, 4, 5 : 봄
//		  - 6, 7, 8 : 여름
//		  - 9, 10, 11 : 가을
//		  - 12, 1, 2 : 겨울
//		  - 그 외 : 해당하는 계절이 없습니다.
//		        ex) 1을 입력 받을 경우 “겨울” 출력
//		             위의 예시를 활용하여 OR 연산자 또는 AND 연산자를 활용하여 문제를 풀어보세요.

			 System.out.println("몇 월인지 입력");
			 int 몇월 = sc.nextInt();
			 
			 if (몇월 >= 3 && 몇월 <= 5) {
				 System.out.println("봄");
			 } else if (몇월 >= 6 && 몇월 <=8) {
				 System.out.println("여름");
			 } else if (몇월 >=9 && 몇월 <=11) {
				 System.out.println("가을");
			 } else {
				 System.out.println("겨울");
			 }

	}


}
