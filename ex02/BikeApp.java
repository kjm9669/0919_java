package day02.ex02;

public class BikeApp {
	public static void main(String[] args) {
		Bike<Aluminum> aBike = new Bike<Aluminum>();
		Aluminum al = new Aluminum();
		aBike.setMaterial(al);
		System.out.println("이 자전거는 " + aBike.toString());
		
		Bike<Titanium> tBike = new Bike<Titanium>();
		Titanium ti = new Titanium();
		tBike.setMaterial(ti);
		System.out.println("이 자전거는 " + tBike);
		tBike.description();
		
		// 생성불가 Mud는 Material을 상속받지 않은 클래스
//		Bike<Mud> mBike = new Bike<Mud>();
	}
}
