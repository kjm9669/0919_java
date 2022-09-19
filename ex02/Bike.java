package day02.ex02;

public class Bike <T extends Material>{
	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void description() {
		material.using();
	}
}
