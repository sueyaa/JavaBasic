package Chapter7.homework.day12.student;

public class Student {
	private String name;
	private int age;
	private char gender;
	private String major;
	
	
	public Student(String name, int age) {
		super();
		this.gender = '男';
		this.major = "Android";
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, char gender, String major) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.major = major;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public void introduce() {
		System.out.println("姓名：" + name + ", 年龄：" + age + ", 性别：" + gender + ", 专业：" + major);
	}
	
	
	

}
