package Chapter8.teacher;

//--实体类.
public class Student {

	private String name;
	private int age;
	private double scroe;

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

	public double getScroe() {
		return scroe;
	}

	public void setScroe(double scroe) {
		this.scroe = scroe;
	}

	public Student(String name, int age, double scroe) {
		// --无论这里是否写super.都会自动调用父类的构造.
		this.name = name;
		this.age = age;
		this.scroe = scroe;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "学生姓名:" + name + ", 年龄:" + age + ", 成绩:" + scroe ;
	}

}
