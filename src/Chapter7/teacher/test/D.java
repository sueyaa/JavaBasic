package Chapter7.teacher.test;

public class D {
	 
	private int i;
	
	public int getI(){
		return i;
	}
	
	//--������i ��ֵ����Ա����i
	//--��������ִ��ʱ�����ؾͽ�ԭ��.�������е�����i
	//--�������i���.����������Ϊ�ǲ���i��ֵ������i
	//--���Ч������������Ҫ��.��Ҫ���߱������ǽ�����i��ֵ��
	//--��Ա����i..��Ա������д�����е�.���ʵ���Ƕ���.������ӵ�е�
	//--����.����ʵ��(����)��ӵ��.��ô���еĳ�Ա����.����Ҳӵ��.
	//--.ֻҪ�а취���ṩһ����ǰ��Ķ���.Java�����������ṩ��һ���ؼ���
	//--this ����ָ����ǰ��(thisд����������)�Ķ���.
	public void setI(int i){
		this.i = i;		
	}
	
	public void method(){
		//--ÿ���������ڴ��ж���һ����ַ
		System.out.println(this);
	
	}
	public static void main(String[] args) {
		D d = new D();
		d.method();
	}
	

}
