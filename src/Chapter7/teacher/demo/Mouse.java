package Chapter7.teacher.demo;

public class Mouse extends Animal {

	public void method(){
		System.out.println(this.getName());
	}	
	
	public static void main(String[] args) {
		Mouse m = new Mouse();
		m.setName("����");
		/*
		 * ��Ϊmain�����Ǿ�̬��.��method�����ǷǾ�̬��.
		 * ��ֻ̬�ܷ��ʾ�̬.���Ҫ���ʷǾ�̬�����ṩ����.
		 * ͨ������.������.
		 * 
		 * 
		 */
		m.method();
	}


}
