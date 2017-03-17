package Chapter7.teacher;

public class ExTest {
	
	public static void main(String[] args) {
		
		ExOne eo = new ExOne();
		/*
		 * 当方法没有返回值时是不可以在输出语句中调用的.
		 */
		System.out.println("结果:" + eo.getNumber(100));
		
		/*
		 * The method println(boolean) in the type PrintStream 
		 * is not applicable for the arguments (void)
		 * 
		 * println(); 本身就是一个方法.该方法需要有1个参数
		 * 
		 * Field : 域 通常指成员变量
		 * Local Variable  : 指局部变量
		 * parameter或者argument 指方法的参数.
		 * 
		 * 
		 */
		//System.out.println(eo.method(100));
		
		double result = eo.methodTwo(eo.getNumber(100));
		System.out.println(result);
		
		Student stu = eo.methodThree(result);
		System.out.println("学生成绩:" + stu.getScore());
		
		
		
		
		
		
	}

}
