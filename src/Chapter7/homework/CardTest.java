package Chapter7.homework;

//2.	输入自己的身份证号码，并由此号码输出自己的生日，年月日

import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个身份证号码：");
		String cardId = input.next();
		
		Card card = new Card(cardId,"wangfen");
		
		int arr[] = new int[18];
		String 	year = cardId.substring(6,10);
		String month = cardId.substring(10, 12);
		String day = cardId.substring(12, 14);
		System.out.println(card.getName() + "的生日为：" + year + "年" + month +"月"+day+"日" );
	}

}
