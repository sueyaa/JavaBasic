package Chapter5;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("�������������룺");
		int pwd  = 123;
		for (int i = 0; i < 3; i++) {
			int pwdin = input.nextInt();
			if(pwdin == pwd){
				System.out.print("������ҪȡǮ���Ǵ�Ǯ");
				break;
			}else{
				if(i == 2){
					System.out.print("�����������������");
				}else{
					System.out.print("����������ٴ������������룺");
				}
			}
		}

	}

}
