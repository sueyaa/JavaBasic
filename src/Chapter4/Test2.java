package Chapter4;

//2.在控制台从键盘输入三个整数，按照从大到小的顺序输出

import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int a = input.nextInt();
		System.out.println("请输入第二个整数");
		int b = input.nextInt();
		System.out.println("请输入第三个整数");
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
		
		System.out.println("按照从大到小的顺序输出:");
		System.out.println(a+">"+b+">"+c);
	}

}
