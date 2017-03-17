package Chapter7.homework.day12.bo;

public class Cat extends Pet{

	public Cat(String name) {
		super(name);
	}
	
	public void eat(Food food){
		if(food.getClass().equals(Fish.class)){
			System.out.println(getName() + "...ÔÚ³Ô..." + food.getName());
		}else{
			System.out.println(getName() + "...²»³Ô..." + food.getName());
		}
	}
	
}
