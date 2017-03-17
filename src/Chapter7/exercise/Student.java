package Chapter7.exercise;

//封装一个学生类有字段:姓名.年龄.性别.要求年龄小于6岁的不可以入学.
public class Student {
	private String name;
	private int age;
	private char gender;
	private double score;
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
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
		if(age < 6){
			System.out.println("年龄小于6岁的不可以入学");
		} else{
			System.out.println("可以上学");
		}
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
