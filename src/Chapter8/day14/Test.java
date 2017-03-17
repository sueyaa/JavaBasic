package Chapter8.day14;

import Chapter8.day14.student.Student;

public class Test {//泛型类
	public static void main(String[] args) {
		Student<Object> stu = new Student();
		Student<A> stu1 = new Student();
		Student<B> stu2 = new Student();
		Student<C> stu3 = new Student();
		method(stu1);
		method(stu2);
		method(stu3);
	}
	//<? super A>表示下限是A，<? extends A> 表示上限是A
	public static void method(Student<? extends A> stu){
		System.out.println(stu.getClass());
	}
		
}
