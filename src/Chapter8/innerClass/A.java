package Chapter8.innerClass;

public class A {
	int i;
	static int j;
	
	void method1(){
		//�ⲿ����Է��������ڲ���ķ����ͱ���
		B b = new B();
		C c = new C();
		c.method();
		c.method2();
		b.methodB();
		b.methodB1();
	}
	
	
	class B{
		//�Ǿ�̬�ڲ����в���������̬������ֻ�����������ͷǾ�̬����
		int m;
		//The field n cannot be declared static in a non-static inner type, unless initialized with a constant expression
		//��һ���Ǿ�̬���ڲ������治��ʹ������Ϊ��̬�ı���,����Ϊ��̬����
		//static int n;
		final static int n = 10;
		//The method main cannot be declared static; static methods can only be declared in a static or top level type
		//main����ֻ�ܱ������ھ�̬����������	
		//�Ǿ�̬���ڲ��಻��������̬������ֻ�������Ǿ�̬����
		public void methodB1(){
			
		}
		//�ڲ�����Է��������ⲿ��,�����ⲿ���еľ�̬�ڲ���ͷǾ�̬�ڲ���
		A a = new A();
		C c = new C();
		D d = new D();
	
		//�Ǿ�̬�ڲ�����Է��������ⲿ��ı����������ⲿ��ľ�̬�ڲ���ı���
		int num = a.i;
		int num2 = a.j;
		int num3 = c.m;
		int num4 = c.k;	
		
		void methodB(){
			//�Ǿ�̬�ڲ�����Է����ⲿ��ķ����Լ��ⲿ��ľ�̬�ڲ�������з���
			//�����ⲿ��ķ�������ʹ������.this.�����������߸����ʵ����.������
			A.this.method1();
			a.method1();
			//�����ⲿ��ľ�̬�ڲ���ʹ������.�����������߸����ʵ����.������
			C.method();
			c.method2();
			c.method();
		}
	}
	
	static class C{
		//��̬�ڲ����п���������̬�����ͷǾ�̬�������Լ�����
		
		int m;
		static int k;
		final static int n = 10;
		
		A a = new A();
		//No enclosing instance of type A is accessible. 
		//Must qualify the allocation with an enclosing instance of type A (e.g. x.new A() where x is an instance of A).
		//��̬����Է��������ⲿ�࣬�����ⲿ��ľ�̬�ڲ��࣬����ֱ�ӷ��������ⲿ��ķǾ�̬�ڲ���
		//�����ⲿ��ķǾ�̬�ڲ������ʹ�����¸�ʽ��new �ⲿ��.new �Ǿ�̬�ڲ���
		B b = new A().new B();
		E e = new E();
		
		//�ھ�̬�ڲ���������main������static�����Լ��Ǿ�̬����
		public static void main(String[] args) {
			
		}
		
		public static void method(){
			
		}
		
		public void method2(){
				//��̬�ڲ�����Է����ⲿ��ķ����Լ��ⲿ��ķǾ�̬�ڲ�������з���
				//�����ⲿ��ķ�������ʹ�ø����ʵ����.������
				a.method1();
				//�����ⲿ��ķǾ�̬�ڲ���ʹ������.�����������߸����ʵ����.������
				b.methodB1();
				b.methodB();
		}
		
	}
	
	class D{
		
	}
	
	static class E{
		
	}
	
}
