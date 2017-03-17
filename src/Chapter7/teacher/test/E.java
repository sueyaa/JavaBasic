package Chapter7.teacher.test;

public class E {
	public E(){
		//Constructor call must be the first statement in a constructor
		super();//--调用父类的无参	
	}
	
	
	/*
	 * this()指代自己类中的其它构造方法.
	 * super() 指代父类中的构造方法.
	 * 
	 * 构造方法调用构造方法必须放在第一行. 
	 * 且super()和this()不可以共存.
	 * super.和this.可以共存.
	 */
	public E(int i){
		this();
//		super();
	}
	
	
	
	
	
	
	
	
	
}
