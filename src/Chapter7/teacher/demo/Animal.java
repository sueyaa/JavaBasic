package Chapter7.teacher.demo;

public class Animal {
	
	
	
	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

	public Animal(){
		super();//--������õ���˭?
	}
	
	private int age;
	private String name;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		//this����ǰ����.->��Ը������һ��Animal�Ķ���.
		//--��ô�Ƿ����ͨ��this�����ʵ�ǰ�����������е��ֶ�
		//--�ֶεķ���: ����.�ֶ�.
		//--ʲô������ǰ: �����Ǹ����о���˭�Ķ���.
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	
	
	
	
	
	
	
	

}
