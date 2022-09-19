package day02.ex01;

public class GenEx01Test {
	public static void main(String[] args) {
		GenEx01<Integer> gen01 = new GenEx01<Integer>(100, 200);
		GenEx01<Double> gen02 = new GenEx01<Double>(100., 200.);
		
		// Character는 Number를 상속받지 않는다. 에러
//		GenEx01<Character> gen03 = new GenEx01<Character>('1', '5');
		
		gen01.sum();
		gen02.sum();
	}
}
