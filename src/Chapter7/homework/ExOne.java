package Chapter7.homework;

import Chapter7.exercise.Student;

/*	1.设计一个方法.这个方法接收int类型的数据.在方法内部把该值/2+1.0 将结果返回.
 * 	2.连接第一题.设计一个方法.该方法接收第一题的返回值的.将该值开根号.并返回.
 * 	3.连接第二题.设计一个方法.方法接收第二题的返回值.将该值作为一个学生中某一个字段的值.最后将学生返回.
*/

public class ExOne {
	public double getNumber(int i){
		return i / 2 + 1.0 ;
	}
	
	public double method(double a){
		return Math.sqrt(a);
	}
	
	public Student method2(double b){
		Student stu = new Student();
		stu.setScore(b);
		return stu;
	}
}
