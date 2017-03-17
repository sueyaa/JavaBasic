package Chapter5.homework;

//5. ������(ʵ�ִӼ�������1900��֮��������ĳ�ꡢĳ�£�������µ�����)

import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����ݣ�");
		int year = input.nextInt();
		System.out.println("������һ���·ݣ�");
		int month = input.nextInt();
		int yearDays = 0;
		int monthDays = 0;
					
		for (int i = 1900; i < year; i++) {
			if(fun(i)){
				yearDays += 366;
			}else{
				yearDays += 365;
			}
		}
		
		for (int i = 1; i < month; i++) {
			monthDays += f(i,year);
		}

		int allDays = yearDays + monthDays;	
		int monDay = f(month,year);
		int xinQi = (allDays) % 7 ;
		
		System.out.println("��\t"+"һ\t"+"��\t"+"��\t"+"��\t"+"��\t"+"��\t");
		
		for (int i = 0; i < (xinQi + 1) ; i++) {
			System.out.print("\t");
		}
		
		for (int i = 1; i <= monDay; i++) {
			System.out.print(i+"\t");
			if((i+xinQi+1) % 7 == 0){
				System.out.println();
			}
		}
		
	}
	
	public static boolean fun(int year){
		boolean flag = true;
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
	}
	
	public static int f(int month,int year){
		int days = 0;
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
			if(fun(year)){
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
		return days;
	}

}
