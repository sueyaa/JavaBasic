package Chapter7.teacher;
public class A {
	int i;
	String s;
	
	public A(){	
		/*
		 * this有2个作用:
		 * 1.代表当前类的一个对象
		 * 2.this() 代表当前类中的其它构造方法..至于具体是哪一个构造
		 * 由参数列表决定.
		 * 构造方法不可以自己调用自己.(递归)
		 * 
		 */
		this(0);//--调用第9行的构造方法.
	}
	public A(String s){
		
	}
	
	public A(int i){		
	//	this(i,"");//--调用第13行的构造方法.
		this.i = 22;
	}
	public A(String s,int i){
		this.i = 10;
		i = 10;//这里的i代表的是参数.
		s = "ABC";
	}
	
	public A(int i,String s){
		this.i = 10;
		//i = 10;//这里的i代表的是参数.
		s = "ABC";
	}
		
	/*
	 *1. 找到main方法
	 * 2.因为A() 是无参构造.因此找A类中的无参构造.
	 * 3.执行this(0) 这里的this()代表A类中非无参的其它构造方法.
	 * 有一个参数0 是int类型那么就会在A类中找1个参数的且是int类型的
	 * 4.找到第20行.参数为int且只有1个参数的.构造方法.
	 */
	public static void main(String[] args) {		
		A a = new A();
		System.out.println(a.i);
	}
	
	
	

}
