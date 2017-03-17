package Chapter7.teacher.interfacedemo;

public class Test {
	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.fly();
		Fly bird = new Bird2();//--也是多态的一种体现之一.
		bird.fly();
		//--getClass  是Object中的方法.用于获取当前对象的类型.
		System.out.println(bird.getClass());
		plane.through();
		plane.change();
		
		
	}

}
