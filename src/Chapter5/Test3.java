package Chapter5;

//3.��5���·�ר���꣬ÿ����๺��3�����û�����ѡ���뿪���������·�������ӡ�ܹ����˼����·���
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		String choice = "";
		
		for (int j = 0; j < 5; j++) {
			System.out.println();
			System.out.println("��ӭ���ٵ�"+ i +"��ר����");
			System.out.print("Ҫ�뿪��(y/n)?");
			Scanner input = new Scanner(System.in);
			choice = input.next();
			while(true){
				if(choice.equals("y")){
					System.out.println("������");
					i++;
					break;
				} else if(choice.equals("n")){
					System.out.println("����һ���·�");
					System.out.print("Ҫ�뿪��(y/n)?");
					choice = input.next();
					sum++;
				} else{
					System.out.println("��������");
				}
			}		
		}
		System.out.println();
		System.out.println("�ܹ�����"+ sum +"���·�");
	}

}
