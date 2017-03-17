package Chapter7.teacher;
/*
 * 1.设计一个方法.这个方法接收int类型的数据.
 * 在方法内部把该值/2+1.0 将结果返回.
 */
public class ExOne {
	
	/*
	 * 1.int类型的加减乘除运算结果一定是int
	 * 2.当n种类型的数据在一起运算时,结果是
	 * 数据类型最大的
	 * 
	 */
	public double getNumber(int i){
		return i / 2 + 1.0;
	}
	
	public void method(int i){
		System.out.println(i);
	}
	
	public double methodTwo(double d){
		//Math.sqrt(X) 求X的平方根 		
		//	Math.abs(d);//--求绝对值.		
		return Math.sqrt(d);
	}
	
	public Student methodThree(double d){
		//--提供学生对象
		Student stu = new Student();
		stu.setScore(d);				
		return stu;
	}
	
	
	

}
