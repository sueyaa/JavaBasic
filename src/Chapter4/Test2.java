package Chapter4;

//2.�ڿ���̨�Ӽ��������������������մӴ�С��˳�����

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = input.nextInt();
		System.out.println("������ڶ�������");
		int b = input.nextInt();
		System.out.println("���������������");
		int c = input.nextInt();
		

		if(a < b){
			int tmp = b;
			b = a;
			a = tmp;
		}
		
		if(a < c){
			int tmp = c;
			c = a;
			a = tmp;
		}
		
		if(b < c){
			int tmp = c;
			c = b;
			b = tmp;
		}
		
		System.out.println("���մӴ�С��˳�����:");
		System.out.println(a+">"+b+">"+c);
	}

}
