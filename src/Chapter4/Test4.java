package Chapter4;

//4������һ��x��ֵ����y��ֵ�����
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��x��ֵ:");
		int x = input.nextInt();
		int y;
		if(x > 0){
			y = 1;
		}else if(x == 0){
			y = 0;
		}else if(x < 0){
			y = -1;
		}else{
			return;
		}
		System.out.println("y��ֵΪ��" + y);
	}

}
