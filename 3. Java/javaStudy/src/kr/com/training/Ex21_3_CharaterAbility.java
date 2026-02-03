package kr.com.training;

public class Ex21_3_CharaterAbility {
	// 아래의 필드들을 가집니다.
	// - 힘(str), 민첩(dex), 지력(knowledge)
	// 레벨(level, 초기값 1)
	// 경험치(exp, 100이 될 경우 레벨이 1증가하고 경험치는 0이됨
	// 체력(hp, 초기값 100, 레벨업을 해도 회복되지않음)
	// 마력(mp, 초기값 100, 레벨업을 해도 회복되지않음)
	// - 모든 필드의 접근 제어자는 private
	private int str;
	private int dex;
	private int knowledge;
	private int level = 1;
	private int exp;
	private int	hp = 100;
	private int	mp = 100;

	
	
	public void setStr(int str) {
		this.str = str;
	}
	
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	public void setKnowledge(int knowledge) {
		this.knowledge = knowledge;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setExp(int exp) {
		this.exp += exp;
		if (exp >= 100) {
			this.level += (this.exp / 100); // 100당 1레벨업
	        this.exp = this.exp % 100;      // 남은 경험치 저장
		}	
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	
	
	
	
	
	
	public int getStr() {
		return str;
	}
	
	public int getDex() {
		return dex;
	}
	
	public int getKnowledge() {
		return knowledge;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExp() {
		return exp;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getMp() {
		return mp;
	}


	
	// - 각 필드에 대한 getter/setter 작성
	// - 현재 능력치를 모두 확인할 수 있는 toString 오버라이딩 작성
	// 		> toString은 문자열을 반환 합니다.w
	// 		> public void String() { return " 문자열 " }
	@Override
	public String toString() {
			return "[캐릭터의 현재 능력치] \n"+ "힘 - " + str + " 민첩 - " + dex + " 지력 - " + knowledge + "\n 레벨" + level + "\n  경험치 : " + exp
					+ "\n 체력 : " + hp +"\n 마나 : " + mp;
			
	}

	
	
	

}
