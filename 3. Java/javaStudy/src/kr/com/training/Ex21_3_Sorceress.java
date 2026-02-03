package kr.com.training;

public class Ex21_3_Sorceress extends Ex21_3_Character{
	// Charactor 클래스 상속 받기
	
	// 소서리스 객체 생성 시 힘 10, 민첩7, 지력 35로 생성됩니다.
	Ex21_3_Sorceress(Ex21_3_CharaterAbility ca){
		super();
		ca.setStr(10);
		ca.setDex(7);
		ca.setKnowledge(35);
	}
	
	
	// attack 메서드 (오버라이딩)
	// - "지팡이를 휘두릅니다." 출력
	// - 경험치 25 증가, 체력 10 감소
	// - 체력이 10미만일 경우 "체력이 부족합니다." 출력
		@Override
	public void attack (Ex21_3_CharaterAbility ca) {
		int nowexp = ca.getExp();
		int nowhp = ca.getHp();
		System.out.println("지팡이를 휘두릅니다.");
		
		ca.setExp(nowexp + 25);
		ca.setHp(nowhp - 10);
		if(ca.getHp() < 10) {
			System.out.println("체력이 부족합니다.");
		}
		
		
		
	}
	
	// skill 메서드 (오버라이딩)
	// - "아이스 에로우를 사용합니다." 출력
	// - 경험치 37 증가, 마력 23 감소
	// - 마력이 23 미만일 경우 "마력이 부족합니다." 출력
		@Override
		public void skill(Ex21_3_CharaterAbility ca) {
			System.out.println("아이스 에로우를 사용합니다");
			int nowmp = ca.getMp();
			int nowexp = ca.getExp();
			
			ca.setMp(nowmp - 23);
			ca.setExp(nowexp + 37);
			if(ca.getMp() < 23) {
				System.out.println("마력이 부족합니다.");
			}
		}
	
	// levelUp 메서드
	// - "레벨업을 하여 지력이 5 증가합니다." 출력
	// - 지력 5 증가 
		
		public void levelUp(Ex21_3_CharaterAbility ca) {
			System.out.println("레벨업을 하여 지력이 5 증가합니다.");
			int nowint = ca.getKnowledge();
			ca.setMp(nowint + 5);
		}
	
	

}
