package Chapter7.teacher;
public class A {
	int i;
	String s;
	
	public A(){	
		/*
		 * this��2������:
		 * 1.����ǰ���һ������
		 * 2.this() ����ǰ���е��������췽��..���ھ�������һ������
		 * �ɲ����б����.
		 * ���췽���������Լ������Լ�.(�ݹ�)
		 * 
		 */
		this(0);//--���õ�9�еĹ��췽��.
	}
	public A(String s){
		
	}
	
	public A(int i){		
	//	this(i,"");//--���õ�13�еĹ��췽��.
		this.i = 22;
	}
	public A(String s,int i){
		this.i = 10;
		i = 10;//�����i������ǲ���.
		s = "ABC";
	}
	
	public A(int i,String s){
		this.i = 10;
		//i = 10;//�����i������ǲ���.
		s = "ABC";
	}
		
	/*
	 *1. �ҵ�main����
	 * 2.��ΪA() ���޲ι���.�����A���е��޲ι���.
	 * 3.ִ��this(0) �����this()����A���з��޲ε��������췽��.
	 * ��һ������0 ��int������ô�ͻ���A������1������������int���͵�
	 * 4.�ҵ���20��.����Ϊint��ֻ��1��������.���췽��.
	 */
	public static void main(String[] args) {		
		A a = new A();
		System.out.println(a.i);
	}
	
	
	

}
