package Chapter7.teacher;
/*
 * 1.���һ������.�����������int���͵�����.
 * �ڷ����ڲ��Ѹ�ֵ/2+1.0 ���������.
 */
public class ExOne {
	
	/*
	 * 1.int���͵ļӼ��˳�������һ����int
	 * 2.��n�����͵�������һ������ʱ,�����
	 * ������������
	 * 
	 */
	public double getNumber(int i){
		return i / 2 + 1.0;
	}
	
	public void method(int i){
		System.out.println(i);
	}
	
	public double methodTwo(double d){
		//Math.sqrt(X) ��X��ƽ���� 		
		//	Math.abs(d);//--�����ֵ.		
		return Math.sqrt(d);
	}
	
	public Student methodThree(double d){
		//--�ṩѧ������
		Student stu = new Student();
		stu.setScore(d);				
		return stu;
	}
	
	
	

}
