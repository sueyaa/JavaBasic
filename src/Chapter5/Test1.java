package Chapter5;

/*1.����һ��������Ʒ���»
	�����
	�������һ�����ӵļ۸�2000-10000֮�䣩���û�ȥ���¼۸�
	�����5���ڲ¶Լ۸񣬱�ɻ�ô���Ʒ��������5�Σ���ʾ���ܿ�ϧ����û�л�ý�Ʒ�����½���������
	��5���ڲ¶ԵĻ�����ʾ����ϲ�㣬����˴˽�Ʒ��������
	��ʾ��
	����2000-10000���������
	1��	�����ڿ�ͷ����Math ��
	Import java.util.Random;
	2��	���������
	Random random=new Random();
	Int price= random.nextInt(8000)+2000;
*/
import java.util.Scanner;
import java.util.Random;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int price = random.nextInt(8000)+2000;
		System.out.println(price);
		Scanner input = new Scanner(System.in);
		System.out.print("��²⡰�����綯�����ļ۸�");
		for (int i = 0; i < 5; i++) {
			int price1 = input.nextInt();
			if(price1 == price){
				System.out.println();
				System.out.println("��ϲ�㣬����˴˽�Ʒ��");
				break;
			}else{
				if(i == 4){
					System.out.println();
					System.out.println("�ܿ�ϧ����û�л�ý�Ʒ�����½�����");
					break;
				}
				if(price1 < price){
					
					System.out.println("�ٴ�㣡");
					System.out.println();
					System.out.print("�ٲ�һ�ΰɣ�");
				}else{
					System.out.println("��С�㣡");
					System.out.println();
					System.out.print("�ٲ�һ�ΰɣ�");
				}
			}	
		}

	}

}
