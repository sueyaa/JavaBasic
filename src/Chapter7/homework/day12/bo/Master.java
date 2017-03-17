package Chapter7.homework.day12.bo;

public class Master {
	private String name;
	
	public Master(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void feed(Pet pet, Food food){
		System.out.println(getName() + "ÔÚÎ¹" + pet.getName() + "³Ô" + food.getName());
		pet.eat(food);
	}
}
