package Chapter7.teacher.demo;

/*
 * Dog extends Cat 语法上不会报错.
 * 因为extends 只会检查左右两边是否都是class.
 * 不会检查是否满足逻辑关系.
 * 但是Dog extends Cat 违反了现实生活中的逻辑.
 * 所以不可以这些.
 * 
 */
public class Dog extends Animal{
	
	public void catchMouse(Mouse mouse){
		System.out.println(getName() + "抓住了"+mouse.getName());
	}
	
	
	
	
	
	
	

}
