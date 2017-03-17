package Chapter7.teacher;

public class Animal {

	private String name;
	private int age;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Animal() {

	}

	public Animal(String name) {
		this.name = name;
	}

	public Animal(int age) {
		this.age = age;
	}

	public Animal(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	public void introduce(){
		System.out.println("ÐÕÃû:" + getName() + "ÑÕÉ«" + getColor() + "ÄêÁä" +getAge());
	}
	
	
	
	
	
	

}
