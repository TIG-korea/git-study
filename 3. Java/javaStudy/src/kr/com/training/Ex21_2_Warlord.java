package kr.com.training;

public class Ex21_2_Warlord extends Ex21_2_Character{
	// Character 클래스를 상속받습니다.
	
	Ex21_2_Warlord(int str, int dex, int knowledge, int level){
		super(50, 10, 10 ,1); //super(50, 10, 10 ,1);

//		 str = 50;
//		 dex = 10;
//		 knowledge = 10;
//		 level = 1;
	}
	
	public void attack() {
		System.out.println("둔기를 휘두릅니다.");
	}
	
	public void levelUp(Ex21_2_Character character) {
		int nowlevel = super.getLevel();  // 현재 레벨
		int nowstr = getStr(); // 현재 힘 
		
		super.setLevel(nowlevel + 1); // 현재 레벨 +1 setter 써서 저장 
		super.setStr(nowstr + 5); // 현재 힘 + 5를 setter 써서 저장
		
		System.out.println("레벨업을 하여 힘이 5 증가합니다.");
		System.out.println("현재 레벨 : " + super.getLevel() + ", 힘 : " + super.getStr());
		
	}
	
	//객체 생성 시 힘50, 민첩10, 지력10, 레벨1로 생성
	// - 부모 생성자를 호출하세요.
	
	//attack 메서드 생성
	// - "둔기를 휘두릅니다" 출력
	
	// levelUp() 메서드 생성
	// - "레벌업을 하여 힘이 5 증가합니다." 출력
	// - "현재 레벨 : 00, 힘 : 00" 출력
	// - 현재 레벨을 1 증가시키고 , 힘을 5 증가시킵니다

}
