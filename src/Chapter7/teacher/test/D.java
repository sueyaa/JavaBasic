package Chapter7.teacher.test;

public class D {
	 
	private int i;
	
	public int getI(){
		return i;
	}
	
	//--将参数i 赋值给成员变量i
	//--编译器在执行时会遵守就近原则.方法体中的两个i
	//--距离参数i最近.编译器会认为是参数i赋值给参数i
	//--这个效果不是我们想要的.需要告诉编译器是将参数i赋值给
	//--成员变量i..成员变量是写在类中的.类的实例是对象.类中所拥有的
	//--内容.它的实例(对象)都拥有.那么类中的成员变量.对象也拥有.
	//--.只要有办法能提供一个当前类的对象.Java针对这个问题提供了一个关键字
	//--this 用来指代当前类(this写在哪里类中)的对象.
	public void setI(int i){
		this.i = i;		
	}
	
	public void method(){
		//--每个对象在内存中都有一个地址
		System.out.println(this);
	
	}
	public static void main(String[] args) {
		D d = new D();
		d.method();
	}
	

}
