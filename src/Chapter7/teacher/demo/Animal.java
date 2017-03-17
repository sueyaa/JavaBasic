package Chapter7.teacher.demo;

public class Animal {
	
	
	
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

	public Animal(){
		super();//--这里调用的是谁?
	}
	
	private int age;
	private String name;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		//this代表当前对象.->针对该类就是一个Animal的对象.
		//--那么是否可以通过this来访问当前对象代表的类中的字段
		//--字段的访问: 对象.字段.
		//--什么叫做当前: 你在那个类中就是谁的对象.
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	
	
	
	
	
	
	

}
