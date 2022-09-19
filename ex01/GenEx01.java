package day02.ex01;

public class GenEx01 <T extends Number>{
	T num1;
	T num2;
	
	public GenEx01(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void sum() {
		System.out.println(num1.intValue() + num2.doubleValue());
	}
}


