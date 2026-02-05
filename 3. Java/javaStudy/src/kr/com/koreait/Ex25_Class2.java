package kr.com.koreait;

import kr.com.koreait.Ex25_1_Calculator.Calc;

public class Ex25_Class2 {

	public static void main(String[] args) {
//		<정적 중첩 클래스 생성 방법>
//		OuterClass.InnerClass inner = new OuterClass.InnerClass();
//		inner.print();
//		
//		<비정적 중첩 클래스 생성 방법>
//		1. 바깥 클래스 객체 생성 먼저
		OuterClass outer = new OuterClass();
		
//		2. 안쪽 (inner) 클래스 객체 생성 
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.print();
		
		Ex25_1_Calculator cal = new Ex25_1_Calculator(10,20);
		Ex25_1_Calculator.Calc c = cal.new Calc();
		System.out.println(c.add());
		
		Ex25_2_Greeting gre = new Ex25_2_Greeting();
		gre.sayHello();
		
//		 익명 내부 클래스			//
		Animal animal = new Animal() {
			
			@Override
			public void sound() {
				System.out.println("소리를 냅니다.");
			}
		};
		
// 		람다식  =  ->
		Animal animal2 = () -> System.out.println("멍멍");
		
		
		
	}
}

// 딱 한 번 오버라이딩 하고 안쓸떄
interface Animal {
	void sound();
}

class OuterClass {
	private static int staticNum = 10; // 클래스 변수
	private int instanceNum = 20; // 인스턴스 변수

//	static class InnerClass {  정적 중첩 클래스
	class InnerClass { // 비정적 중첩 클래스
		public void print() {
			System.out.println(instanceNum);
			System.out.println(staticNum);
		}
	}
}
