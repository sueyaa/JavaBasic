package Chapter4;

//1.使用条件结构从键盘输入一个月份，打印输出对应的季节（春、夏、秋、冬）
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个月份（1~12）：");
		int month = input.nextInt();
		/*if(month == 1 || month == 2 || month == 3){
			System.out.println("春");
		} else if(month == 4 || month == 5 || month == 6){
			System.out.println("夏");
		} else if(month == 7 || month == 8 || month == 9){
			System.out.println("秋");
		} else if(month == 10 || month == 11 || month == 12){
			System.out.println("冬");
		} else{
			System.out.println("输入有误");
		}*/
		if(month >= 1 && month <= 2 || month == 12){
			System.out.println("春");
		} else if(month <= 5){
			System.out.println("夏");
		} else if(month <= 8){
			System.out.println("秋");
		} else if(month <= 11){
			System.out.println("冬");
		} else{
			System.out.println("输入有误");
		}
		
	}

}
