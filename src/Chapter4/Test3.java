package Chapter4;

/*3.	实现从键盘输入年、月，判断该年是闰年还是平年，判断对应的月份天数
（判断闰年的条件：能被400整除，或者能被4整除却不能被100整除）*/
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = input.nextInt();
		System.out.println("请输入一个月份：");
		int month = input.nextInt();
		int days = 0;
		boolean flag = true;
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + "年是闰年");
			flag = true;
		}else{
			System.out.println(year + "年是平年");
			flag = false;
		}
		
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 2:
				if(flag){
					days = 29;
					break;
				}else{
					days = 28;
					break;
				}
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			default:
				break;		
		}
		System.out.println(month + "月" + days + "天");
	}

}
