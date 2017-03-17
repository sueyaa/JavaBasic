package Chapter7.teacher.interfacedemo;

public class Plane implements Fly,A,B{

	@Override
	public void fly() {
		System.out.println("空中快车正在往返于天上和地面.");
	}

	@Override
	public void through() {
		// TODO Auto-generated method stub
		System.out.println("过去现在和未来你想去哪里.");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("可以变形的飞机.");
		
	}

}
