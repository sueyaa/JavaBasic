package Chapter7.exercise;

//��װһ��ѧ�������ֶ�:����.����.�Ա�.Ҫ������С��6��Ĳ�������ѧ.
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
			System.out.println("����С��6��Ĳ�������ѧ");
		} else{
			System.out.println("������ѧ");
		}
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
}
