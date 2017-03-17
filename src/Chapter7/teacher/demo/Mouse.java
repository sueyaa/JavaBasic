package Chapter7.teacher.demo;

public class Mouse extends Animal {

	public void method(){
		System.out.println(this.getName());
	}	
	
	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.setName("测试");
		/*
		 * 因为main方法是静态的.而method方法是非静态的.
		 * 静态只能访问静态.如果要访问非静态必须提供对象.
		 * 通过对象.来方法.
		 * 
		 * 
		 */
		m.method();
	}


}
