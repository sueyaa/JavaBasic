package Chapter7.teacher.demo;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat();
		//The field Animal.age is not visible
		//cat.age = 10;//--这里的age是Animal的.
		
		//The method setName(String) is undefined for the type Cat
		cat.setName("小花");
		cat.setAge(2);
		
		System.out.println("age:"+cat.getAge());
		System.out.println("name:" + cat.getName());
		
		Mouse mouse = new Mouse();
		mouse.setName("Jerry");
		System.out.println(mouse);
		
		Dog dog = new Dog();
		dog.setName("斯派克");
		
		dog.catchMouse(mouse);//--它是Dog中特有的.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
