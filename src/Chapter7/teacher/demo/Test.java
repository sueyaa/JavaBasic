package Chapter7.teacher.demo;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat();
		//The field Animal.age is not visible
		//cat.age = 10;//--�����age��Animal��.
		
		//The method setName(String) is undefined for the type Cat
		cat.setName("С��");
		cat.setAge(2);
		
		System.out.println("age:"+cat.getAge());
		System.out.println("name:" + cat.getName());
		
		Mouse mouse = new Mouse();
		mouse.setName("Jerry");
		System.out.println(mouse);
		
		Dog dog = new Dog();
		dog.setName("˹�ɿ�");
		
		dog.catchMouse(mouse);//--����Dog�����е�.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
}
