package Chapter4;

import java.util.Scanner;

/*90~100	A等。
80-89	B等。
70-79	C等。
60-69	D等。
60以下	E等。
请根据给定成绩，输出对应的等级。*/
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		System.out.println("请输入考试成绩：");
		int score = input.nextInt();
		if(score >= 90 && score <= 100){
			System.out.println("A等");
		} else if(score >= 80 && score <= 89){
			System.out.println("B等");
		} else if(score >= 70 && score <= 79){
			System.out.println("C等");
		} else if(score >= 60 && score <= 69){
			System.out.println("D等");
		} else if(score < 60){
			System.out.println("E等");
		} else{
			System.out.println("输入分数格式不正确");
		}*/

		/*Scanner input = new Scanner(System.in);
		System.out.println("请输入一个1-7的整数");
		int i = input.nextInt();
		if(i == 1){
			System.out.println("星期" + i);
		} else if(i == 2){
			System.out.println("星期" + i);
		} else if(i == 3){
			System.out.println("星期" + i);
		} else if(i == 4){
			System.out.println("星期" + i);
		} else if(i == 5){
			System.out.println("星期" + i);
		} else if(i == 6){
			System.out.println("星期" + i);
		} else if(i == 7){
			System.out.println("星期" + i);
		} else{
			System.out.println("输入有误");
		}
		
		switch(i){
			case 1:
				System.out.println("星期1");
				break;
			case 2:
				System.out.println("星期2");
				break;
			case 3:
				System.out.println("星期3");
				break;
			case 4:
				System.out.println("星期4");
				break;
			case 5:
				System.out.println("星期5");
				break;
			case 6:
				System.out.println("星期6");
				break;
			case 7:
				System.out.println("星期7");
				break;
			default:
				System.out.println("输入有误");
				break;
		}*/
		
		int a = 10;
		int b = 11;
		 String result = (a == b) ? "相等":"不相等";
		 System.out.println(result);
	}
}
