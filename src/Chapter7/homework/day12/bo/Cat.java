package Chapter7.homework.day12.bo;

public class Cat extends Pet{

	public Cat(String name) {
		super(name);
	}
	
	public void eat(Food food){
		if(food.getClass().equals(Fish.class)){
			System.out.println(getName() + "...�ڳ�..." + food.getName());
		}else{
			System.out.println(getName() + "...����..." + food.getName());
		}
	}
	
}
