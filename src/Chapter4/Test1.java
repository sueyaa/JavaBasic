package Chapter4;

//1.ʹ�������ṹ�Ӽ�������һ���·ݣ���ӡ�����Ӧ�ļ��ڣ������ġ������
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���·ݣ�1~12����");
		int month = input.nextInt();
		/*if(month == 1 || month == 2 || month == 3){
			System.out.println("��");
		} else if(month == 4 || month == 5 || month == 6){
			System.out.println("��");
		} else if(month == 7 || month == 8 || month == 9){
			System.out.println("��");
		} else if(month == 10 || month == 11 || month == 12){
			System.out.println("��");
		} else{
			System.out.println("��������");
		}*/
		if(month >= 1 && month <= 2 || month == 12){
			System.out.println("��");
		} else if(month <= 5){
			System.out.println("��");
		} else if(month <= 8){
			System.out.println("��");
		} else if(month <= 11){
			System.out.println("��");
		} else{
			System.out.println("��������");
		}
		
	}

}
