package day02.quiz;

public class Concert {
	private String title;
	//장소
	private String venue;
	
	// 좌석 타입 배열(객체배열)
	private SeatType[] seatTypes;
	
	// 좌석 타입 배열 크기
	private int typeCnt;
	
	public Concert() {}
	
	// 인자 생성자(공연제목, 장소, 좌석타입의 수)
	public Concert(String title, String venue, int typeCnt) {
		this.title = title;
		this.venue = venue;
		this.typeCnt = typeCnt;
		seatTypes = new SeatType[typeCnt];
	}
	
	// getter /setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public SeatType[] getSeatTypes() {
		return seatTypes;
	}

	public void setSeatTypes(SeatType[] seatTypes) {
		this.seatTypes = seatTypes;
	}

	public int getTypeCnt() {
		return typeCnt;
	}

	public void setTypeCnt(int typeCnt) {
		this.typeCnt = typeCnt;
	}
	
	// 공연정보 메소드
	public void showInfo() {				
		System.out.println("────────────── 공연 정보 ──────────────");		
		System.out.println("\t"+title);
		System.out.println("\t--------------------");
		System.out.println("공연 장소 : "+ venue);
		System.out.print("가격 : ");
		for(int i = 0; i<typeCnt; i++) {
			System.out.print(seatTypes[i].getType() + "석 ");
			System.out.print(seatTypes[i].getPrice() + "원 / ");
		}
		System.out.println();
		System.out.println("─────────────────────────────────────\n");		
	}
}
