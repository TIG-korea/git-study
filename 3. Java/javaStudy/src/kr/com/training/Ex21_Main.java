package kr.com.training;

public class Ex21_Main {

	public static void main(String[] args) {

		Ex21_1_Order order = new Ex21_1_Order();
		order.setNumber("ORDER3");
		order.setStatus("결제완료");
		order.setAmount(120.5);

		
		//----------------------------------------------------------------------
		// 캐릭터의 능력치를 가진 객체
		Ex21_3_CharaterAbility ca = new Ex21_3_CharaterAbility();
		
		
		
		
		// 소서리스 객체 
		Ex21_3_Sorceress sorceress = new Ex21_3_Sorceress(ca);
	
		System.out.println(ca.toString());
		
		sorceress.attack(ca);
		sorceress.skill(ca);
		sorceress.skill(ca);
		sorceress.levelUp(ca);
		
		System.out.println(ca.toString());

		
		
	}

}
