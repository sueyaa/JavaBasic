package Chapter5.homework;

/*3.����ͬ�����ҹ��Ŵ�������Ȥ��֮һ����Լ��1500��ǰ���������㾭���м��������� һ���⣺��������ͬ����
    ����35��ͷ������94�㣬�ʼ��ø���ֻ���Ա�д��������� ����*/

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		for(;i<35;i++){
			if( 2 * i + 4 * (35-i) == 94){
				System.out.println("����"+ i +"ֻ");
				System.out.println("����"+(35-i)+"ֻ");
			}
		}
	}

}
