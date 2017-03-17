package Chapter5;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的密码：");
		int pwd  = 123;
		for (int i = 0; i < 3; i++) {
			int pwdin = input.nextInt();
			if(pwdin == pwd){
				System.out.print("请问您要取钱还是存钱");
				break;
			}else{
				if(i == 2){
					System.out.print("密码已输入错误三次");
				}else{
					System.out.print("密码错误，请再次输入您的密码：");
				}
			}
		}

	}

}
