package day02.quiz;

public class Seat {
	// 예약자 이름
	private String name;
	
	public Seat() {
		name = null;
	}
	
	// 예약자 이름 설정
	public void setBookerName(String name) {
		this.name = name;
	}
	
	// 예약 여부 확인
	public boolean isBooked() {
		if(name == null) return false;
		else return true;
	}
	
	// 예약취소
	public void cancel() {
		name = null;
	}
	
	// getter메소드
	public String getName() {
		return name;
	}
}
