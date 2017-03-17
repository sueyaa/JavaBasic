package Chapter7.homework;

import Chapter7.exercise.Student;

public class ExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExOne ex = new ExOne();
		double a = ex.getNumber(100);
		System.out.println(a);
		double b = ex.method(a);
		System.out.println(b);
		Student stu = ex.method2(b);
		System.out.println("学生的成绩为：" + stu.getScore());
	}

}
