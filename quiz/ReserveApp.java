package day02.quiz;

import java.util.Scanner;

public class ReserveApp {
	private static void showMenu(String title) {
		System.out.println("-----"+ title +" Menu ------");		
		System.out.println(" 0. 공연정보");
		System.out.println(" 1. 예약하기");
		System.out.println(" 2. 좌석조회");
		System.out.println(" 3. 예약취소");
		System.out.println(" 4. 종료");
		System.out.println("-------------------------------------");
		System.out.println("원하는 메뉴번호를 선택하세요 >> ");
	}
	
	private static void subMenu() {
		System.out.println("------ 좌석 예약 현황 알아보기-------");
		System.out.println("1. R 잔여석");
		System.out.println("2. S 잔여석");
		System.out.println("3. A 잔여석");
		System.out.println("4. 이전 메뉴");
	}
	
	public static void main(String[] args) {
		Concert cc = new Concert("BTS 2022 Live 콘서트", "올림픽공원", 3);
		
		String title = cc.getTitle();
		SeatType[] seatTypes = cc.getSeatTypes();
		
		seatTypes[0] = new SeatType('R', 5, 100000); 
		seatTypes[1] = new SeatType('S', 7, 80000); 
		seatTypes[2] = new SeatType('A', 9, 60000); 
		
		int sel = 0;
		
		while(sel != 4){
			int subMenuNum; // 서브메뉴 변수
			
			showMenu(title); // 메인 메뉴
			
			Scanner sc = new Scanner(System.in);
			sel = sc.nextInt(); // 입력메뉴
			
			switch(sel) {
			case 0:
				cc.showInfo();
				break;
			case 1: // 예약하기
				subMenu();
				subMenuNum = sc.nextInt();
				
				// 좌석 타입 유효성 체크
				if(subMenuNum < 1 || subMenuNum > 4 ) {
					System.out.println("메뉴를 다시 선택하세요!!");
					break;
				}
				
				if(subMenuNum == 4) showMenu(title); //메인 메뉴이동
				
				else seatTypes[subMenuNum - 1].seatReserve();
				break;
				
			case 2: // 좌석 조회하기
				for(int i =0; i < seatTypes.length; i++) {
					seatTypes[i].showSeat();
				}
				System.out.println("조회를 완료 하였습니다!!! \n\n");
				break;
			case 3: // 예약 취소하기	
				
			case 4: // 종료
				System.out.println("bye bye~~");
				break;
			default:
				System.out.println("메뉴를 잘못 입력하였습니다!!!");
			}
		}// while		
		
	}
}
