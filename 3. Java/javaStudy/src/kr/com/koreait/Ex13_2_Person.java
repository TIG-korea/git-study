package kr.com.koreait;

public class Ex13_2_Person {
	// 이름, 나이 입력받고 " 안녕하세요. 제 이름은 OOO, 나이는 OO 살입니다" 출력
	public void introduce(String name, int age) {

		System.out.println("안녕하세요. 제 이름은 " + name + ", 나이는 " + age + "살입니다.");

	}

	// 혼공운영체재, 공룡책 , 리버싱 , 노랭이책

	// sayAge() 메서드 생성
	// - 매개변수로 나이를 받은 후
	// - 나이를 반환
	// - " 나이는 00살 입니다."
	public String sayAge(int age) {
		return age + "살 입니다.";
	}

}
