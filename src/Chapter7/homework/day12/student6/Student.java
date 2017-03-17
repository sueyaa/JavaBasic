package Chapter7.homework.day12.student6;

public class Student implements Comparable<Student>{
	private int stuNo;
	private String stuName;
	private double score;
	
	public Student(int stuNo, String stuName, double score) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.score = score;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public int compareTo(Student stu) {		
		if(this.score == stu.getScore()){
			return (int)this.getStuName().compareTo(stu.getStuName());
		}else{
			return (int)(this.getScore() - stu.getScore());
		}
	}

	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", stuName=" + stuName + ", score=" + score + "]";
	}
	
}
