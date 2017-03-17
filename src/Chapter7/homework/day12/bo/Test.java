package Chapter7.homework.day12.bo;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("小明"); 
		Dog dog = new Dog("旺财");
		Cat cat = new Cat("小花");
		Food food = new Bone("骨头");
		
		master.feed(dog, food);
		master.feed(cat, food);
	}
}
