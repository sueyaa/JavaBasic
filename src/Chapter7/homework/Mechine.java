package Chapter7.homework;

public class Mechine {
	String name;
	int number;
	int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public static String findName(int n){
		String name = "";
		switch(n){
			case 1:
				name = "Áõ±¸";
				break;
			case 2:
				name = "ËïÈ¨";
				break;
			case 3:
				name = "²Ü²Ù";
				break;
			default:
				break;
		}
		return name;
	}
	
	
}
	