package Chapter7.teacher.interfacedemo;

public class Plane implements Fly,A,B{

	@Override
	public void fly() {
		System.out.println("���п쳵�������������Ϻ͵���.");
	}

	@Override
	public void through() {
		// TODO Auto-generated method stub
		System.out.println("��ȥ���ں�δ������ȥ����.");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("���Ա��εķɻ�.");
		
	}

}
