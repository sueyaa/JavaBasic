package Chapter7.homework;

import Chapter7.exercise.Student;

/*	1.���һ������.�����������int���͵�����.�ڷ����ڲ��Ѹ�ֵ/2+1.0 ���������.
 * 	2.���ӵ�һ��.���һ������.�÷������յ�һ��ķ���ֵ��.����ֵ������.������.
 * 	3.���ӵڶ���.���һ������.�������յڶ���ķ���ֵ.����ֵ��Ϊһ��ѧ����ĳһ���ֶε�ֵ.���ѧ������.
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
