package Chapter7.homework.day12.bo;

public class Test {
	public static void main(String[] args) {
		Master master = new Master("С��"); 
		Dog dog = new Dog("����");
		Cat cat = new Cat("С��");
		Food food = new Bone("��ͷ");
		
		master.feed(dog, food);
		master.feed(cat, food);
	}
}
