package Chapter5;
/*
	2.��ɹ�����Ʒ���㹦�ܣ�
		1��ѭ��������Ʒ��ź͹����������������ѽ��ۼӵ��ܽ��
		2�����롰n����ʼ���ˣ�������8�ۣ�
		3������ʵ������������
*/

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������ع������ϵͳ    ��   �������");
		System.out.println();
		System.out.println();
		System.out.println("***************************************************");
		System.out.println("��������Ʒ��ţ�");
		System.out.println();
		System.out.println("1.T��		2.����Ь		3.������");
		System.out.println("***************************************************");
		System.out.println();
		boolean flag = true;
		double sum = 0.0;
		
		while(flag){
			System.out.print("��������Ʒ��ţ�");
			int number = input.nextInt();
			System.out.print("��������Ʒ������");
			int count = input.nextInt();
			double price = 0.0;
			String comm = "";
			if(number == 1){
				price = 245.0;
				comm = "T��";
			} else if(number == 2){
				price = 570.0;
				comm = "����Ь";
			} else if(number == 3){
				price = 300.0;
				comm = "������";
			} else{
				System.out.println("��������");
			}
			sum += price * count;
			System.out.println(comm +'\t'+ "��" + price +'\t'+ "��" + price * count);
			System.out.println();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                    	System.out.print("�Ƿ������y/n��");
			String choice = input.next();
			if(choice.equals("y")){
				flag = true;
			}else if(choice.equals("n")){
				flag = false;
				System.out.print("�ۿۣ�");
				double discount = input.nextDouble();
				sum *= discount;
				System.out.println("����ܼ� " +'\t'+ "��" + sum);
				System.out.print("ʵ�ʽ���"+'\t'+"��");
				double money = input.nextDouble();
				System.out.println("��Ǯ"+'\t' +"��"+ (money-sum));
			}
		}
		
	}

}
