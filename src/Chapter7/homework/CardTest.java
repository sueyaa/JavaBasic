package Chapter7.homework;

//2.	�����Լ������֤���룬���ɴ˺�������Լ������գ�������

import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ�����֤���룺");
		String cardId = input.next();
		
		Card card = new Card(cardId,"wangfen");
		
		int arr[] = new int[18];
		String 	year = cardId.substring(6,10);
		String month = cardId.substring(10, 12);
		String day = cardId.substring(12, 14);
		System.out.println(card.getName() + "������Ϊ��" + year + "��" + month +"��"+day+"��" );
	}

}
