package Chapter7.homework;

/*	4.设计一个动物类Animal里面有3个字段分别是姓名.年龄和颜色.
	根究3个字段设计4个构造法.并利用这4个构造方法创建4个对象.(要求对3个字段都进行赋值).
	按照年龄进行排序.要求4个对象使用数组保存
*/

public class Cat {
	private String name;
	private int age;
	private String color;

	public Cat() {
		super();
	}

	public Cat(int age) {
		super();
		this.age = age;
	}

	public Cat(String name) {
		super();
		this.name = name;
	}
	
	public Cat(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

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

	@Override
	public String toString() {
		return "姓名：" + name + ", 年龄：" + age + ", 颜色：" + color;
	}

}
