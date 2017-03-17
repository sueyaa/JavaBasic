package Chapter7.homework;

/*	4.���һ��������Animal������3���ֶηֱ�������.�������ɫ.
	����3���ֶ����4�����취.��������4�����췽������4������.(Ҫ���3���ֶζ����и�ֵ).
	���������������.Ҫ��4������ʹ�����鱣��
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
		return "������" + name + ", ���䣺" + age + ", ��ɫ��" + color;
	}

}
