package Chapter4;

/*3.	ʵ�ִӼ��������ꡢ�£��жϸ��������껹��ƽ�꣬�ж϶�Ӧ���·�����
���ж�������������ܱ�400�����������ܱ�4����ȴ���ܱ�100������*/
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int year = input.nextInt();
		System.out.println("������һ���·ݣ�");
		int month = input.nextInt();
		int days = 0;
		boolean flag = true;
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + "��������");
			flag = true;
		}else{
			System.out.println(year + "����ƽ��");
			flag = false;
		}
		
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				if(flag){
					days = 29;
					break;
				}else{
					days = 28;
					break;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default:
				break;		
		}
		System.out.println(month + "��" + days + "��");
	}

}
