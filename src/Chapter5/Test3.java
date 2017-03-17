package Chapter5;

//3.有5家衣服专卖店，每家最多购买3件。用户可以选择离开，可以买衣服。最后打印总共买了几件衣服。
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		String choice = "";
		
		for (int j = 0; j < 5; j++) {
			System.out.println();
			System.out.println("欢迎光临第"+ i +"家专卖店");
			System.out.print("要离开吗(y/n)?");
			Scanner input = new Scanner(System.in);
			choice = input.next();
			while(true){
				if(choice.equals("y")){
					System.out.println("离店结账");
					i++;
					break;
				} else if(choice.equals("n")){
					System.out.println("买了一件衣服");
					System.out.print("要离开吗(y/n)?");
					choice = input.next();
					sum++;
				} else{
					System.out.println("输入有误");
				}
			}		
		}
		System.out.println();
		System.out.println("总共买了"+ sum +"件衣服");
	}

}
