package Chapter7.teacher.interfacedemo;

public class Test {
	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.fly();
		Fly bird = new Bird2();//--Ҳ�Ƕ�̬��һ������֮һ.
		bird.fly();
		//--getClass  ��Object�еķ���.���ڻ�ȡ��ǰ���������.
		System.out.println(bird.getClass());
		plane.through();
		plane.change();
		
		
	}

}
