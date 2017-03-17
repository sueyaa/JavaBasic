package Chapter5;

/*1.现有一个电视商品竞猜活动
	活动规则：
	随机出现一个电视的价格（2000-10000之间），用户去竞猜价格，
	如果在5次内猜对价格，便可获得此商品。（超过5次，显示”很可惜，你没有获得奖品，竞猜结束。”，
	在5次内猜对的话，显示”恭喜你，获得了此奖品。”）。
	提示：
	产生2000-10000的随机数：
	1）	首先在开头导入Math 类
	Import java.util.Random;
	2）	生成随机数
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
		System.out.print("请猜测“公主电动车”的价格：");
		for (int i = 0; i < 5; i++) {
			int price1 = input.nextInt();
			if(price1 == price){
				System.out.println();
				System.out.println("恭喜你，获得了此奖品。");
				break;
			}else{
				if(i == 4){
					System.out.println();
					System.out.println("很可惜，你没有获得奖品，竞猜结束。");
					break;
				}
				if(price1 < price){
					
					System.out.println("再大点！");
					System.out.println();
					System.out.print("再猜一次吧：");
				}else{
					System.out.println("再小点！");
					System.out.println();
					System.out.print("再猜一次吧：");
				}
			}	
		}

	}

}
