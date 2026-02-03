package kr.com.training;

public class Ex21_2_Character {
private	int str;
private	int dex;
private	int knowledge;
private	int level;
	// 힘(str), 민첩(dex), 지력(knowledge), 레벨(level) 필드를 가집니다.
	// - 모두 정수형
	// - 접근제어자 : private

Ex21_2_Character(int str, int dex, int knowledge, int level){
	this.str = str;
	this.dex = dex;
	this.knowledge = knowledge;
	this.level = level;
}



 public void walk() {
	 System.out.println("캐릭터가 한걸음 움직입니다.");
 }
 public void stop() {
	 System.out.println("캐릭터가 멈춥니다.");
 }
 
 public void setStr(int str) {
	 this.str = str;
 }
 public void setLevel(int level) {
	 this.level = level;
 }
 public int getStr() {
	 return str;
 }
 public int getLevel() {
	 return level;
 }
 
 
	
	// walk 메서드를 가집니다.
	// - "캐릭터가 한걸음 움직입니다" 출력
	// stop 메서드를 가집니다.
	// - "캐릭터가 멈춥니다" 출력
	
	// 힘과 레벨 필드에 대한 getter/setter 
	
	
}
