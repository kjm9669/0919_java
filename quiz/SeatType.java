package day02.quiz;

import java.util.Scanner;

public class SeatType {
	private char type;
	
	private int price;
	
	// Seat타입의 객체배열
	private Seat[] arrSeat;
	
	// 인자생성자(좌석의 타입, 좌석수, 가격)
	public SeatType(char Type, int num, int price) {
		this.type = type;
		this.price = price;
		arrSeat = new Seat[num]; // 메모리 할당
		
		for(int i=0; i<arrSeat.length; i++) {
			arrSeat[i] = new Seat();
		}
	}

	// getter / setter
	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Seat[] getArrSeat() {
		return arrSeat;
	}

	public void setArrSeat(Seat[] arrSeat) {
		this.arrSeat = arrSeat;
	}
	
	// 좌석 예약하기
	public void seatReserve() {
		Scanner sc = new Scanner(System.in);
		int seatNum; // 좌석번호
		String name; // 예약자 이름
		
		showSeat(); // 예약현황 확인하기
		
		System.out.println("예약자 이름 :");
		name = sc.next();
		
		System.out.println("좌석 번호 :");		
		seatNum = sc.nextInt();
		
		// 좌석번호 유효한지 체크
		if(seatNum < 1 || seatNum > arrSeat.length) {
			System.out.println("잘못된 좌석번호를 입력하였습니다!!");
			return; // 함수 종료
		}
		
		// 예약된 좌석인지 확인하기
		if(arrSeat[seatNum-1].isBooked()) {
			System.out.println("예약된 좌석번호 입니다!!");
			return;
		}
		
		// 유효한 좌석번호 이면 예약자이름을 설정한다.
		arrSeat[seatNum-1].setBookerName(name);
		System.out.println("예약 완료 되었습니다!!");
		System.out.println("---- 예약 정보 ----");
		System.out.println("예약자 	: " + name);
		System.out.println("좌석번호  : " + type + seatNum + "\n\n");
	}
	// 좌석 예약현황 보기
	public void showSeat() {
		System.out.println("──── "+this.type+"석 예약 현황 ────");
		
		for(int i = 0; i<arrSeat.length; i++) {
			if(arrSeat[i].isBooked())
				System.out.print("["+arrSeat[i].getName()+"]");
			else
				System.out.print("["+(i+1)+"]");
			System.out.print(" ");
		}
		System.out.println("\n");
	}
	
	// 예약취소
	public boolean cancel() {
		return false;
	}
	
}
