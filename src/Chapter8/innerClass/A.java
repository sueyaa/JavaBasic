package Chapter8.innerClass;

public class A {
	int i;
	static int j;
	
	void method1(){
		//外部类可以访问它的内部类的方法和变量
		B b = new B();
		C c = new C();
		c.method();
		c.method2();
		b.methodB();
		b.methodB1();
	}
	
	
	class B{
		//非静态内部类中不能声明静态变量，只能声明常量和非静态变量
		int m;
		//The field n cannot be declared static in a non-static inner type, unless initialized with a constant expression
		//在一个非静态的内部类里面不能使用声明为静态的变量,除非为静态常量
		//static int n;
		final static int n = 10;
		//The method main cannot be declared static; static methods can only be declared in a static or top level type
		//main方法只能被声明在静态类或者最高类	
		//非静态的内部类不能声明静态方法，只能声明非静态方法
		public void methodB1(){
			
		}
		//内部类可以访问它的外部类,他的外部类中的静态内部类和非静态内部类
		A a = new A();
		C c = new C();
		D d = new D();
	
		//非静态内部类可以访问它的外部类的变量，它的外部类的静态内部类的变量
		int num = a.i;
		int num2 = a.j;
		int num3 = c.m;
		int num4 = c.k;	
		
		void methodB(){
			//非静态内部类可以访问外部类的方法以及外部类的静态内部类的所有方法
			//访问外部类的方法可以使用类名.this.方法名，或者该类的实例名.方法名
			A.this.method1();
			a.method1();
			//访问外部类的静态内部类使用类名.方法名，或者该类的实例名.方法名
			C.method();
			c.method2();
			c.method();
		}
	}
	
	static class C{
		//静态内部类中可以声明静态变量和非静态变量，以及常量
		
		int m;
		static int k;
		final static int n = 10;
		
		A a = new A();
		//No enclosing instance of type A is accessible. 
		//Must qualify the allocation with an enclosing instance of type A (e.g. x.new A() where x is an instance of A).
		//静态类可以访问它的外部类，它的外部类的静态内部类，不能直接访问它的外部类的非静态内部类
		//访问外部类的非静态内部类必须使用如下格式：new 外部类.new 非静态内部类
		B b = new A().new B();
		E e = new E();
		
		//在静态内部类中声明main方法，static方法以及非静态方法
		public static void main(String[] args) {
			
		}
		
		public static void method(){
			
		}
		
		public void method2(){
				//静态内部类可以访问外部类的方法以及外部类的非静态内部类的所有方法
				//访问外部类的方法可以使用该类的实例名.方法名
				a.method1();
				//访问外部类的非静态内部类使用类名.方法名，或者该类的实例名.方法名
				b.methodB1();
				b.methodB();
		}
		
	}
	
	class D{
		
	}
	
	static class E{
		
	}
	
}
