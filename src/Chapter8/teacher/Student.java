package Chapter8.teacher;

//--ʵ����.
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
		// --���������Ƿ�дsuper.�����Զ����ø���Ĺ���.
		this.name = name;
		this.age = age;
		this.scroe = scroe;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "ѧ������:" + name + ", ����:" + age + ", �ɼ�:" + scroe ;
	}

}
