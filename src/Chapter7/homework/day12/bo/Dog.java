package Chapter7.homework.day12.bo;

public class Dog extends Pet{

	public Dog(String name) {
		super(name);
	}

	public void eat(Food food){
		if(food.getClass().equals(Bone.class)){
			System.out.println(getName() + "...�ڳ�..." + food.getName());
		}else{
			System.out.println(getName() + "...����..." + food.getName());
		}
	}
}
