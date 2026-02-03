package kr.com.training;

public class Ex21_1_Order {
	private String number;
	private String status;
 	private double amount;
	
	// number, amount, status 필드를 가집니다.
	// - 접근제어자 : private
	// = number, status는 문자열, amount는 실수형 
	
 	public void setNumber(String number) {
 		this.number = number;
 	}
 	public void setStatus(String status) {
 		this.status = status;
 	}
 	public void setAmount(double amount) {
		if(amount < 100.0 ) {
 			System.out.println("유효하지 않은 금액입니다");
 			this.amount = 0; // 0으로 값을 지정 
 		}else {
 			System.out.println("주문 번호 : " + number + ", 주문 금액 : " + amount + ", 주문 상태 :" + status);
 			this.amount = amount; 
 		}
 	}
 	
 	public String getNumber() {
 		return number;
 	}
 	public String getStatus() {
 		return status;
 	}
 	public double getAmount() {	
 		return amount;
 	}
 			
 			
	// 필드 3개에 대한 getter/setter
	// - amount 필드의 setter에서 주문 금액이 100.0 미만일 경우
	// " 유효하지 않은 금액입니다. "  출력 -> 0으로 초기화
	// - 동일하게 amount 필드의 setter에서 주문 금액이 100.0 이상일 겨우
	// " 주문 번호 : 000, 주문 금액 : 000, 주문 상태 : 000" -> 받은 주문 금액으로 초기화
	
	// 주문 번호(number), 주문 금액(amount), 주문 상태(status)
	// ex) "ORDER3", 120.5, "결제완료"

}
