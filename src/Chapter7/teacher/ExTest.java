package Chapter7.teacher;

public class ExTest {
	
	public static void main(String[] args) {
		
		ExOne eo = new ExOne();
		/*
		 * ������û�з���ֵʱ�ǲ��������������е��õ�.
		 */
		System.out.println("���:" + eo.getNumber(100));
		
		/*
		 * The method println(boolean) in the type PrintStream 
		 * is not applicable for the arguments (void)
		 * 
		 * println(); �������һ������.�÷�����Ҫ��1������
		 * 
		 * Field : �� ͨ��ָ��Ա����
		 * Local Variable  : ָ�ֲ�����
		 * parameter����argument ָ�����Ĳ���.
		 * 
		 * 
		 */
		//System.out.println(eo.method(100));
		
		double result = eo.methodTwo(eo.getNumber(100));
		System.out.println(result);
		
		Student stu = eo.methodThree(result);
		System.out.println("ѧ���ɼ�:" + stu.getScore());
		
		
		
		
		
		
	}

}
