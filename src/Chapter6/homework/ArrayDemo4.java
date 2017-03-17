package Chapter6.homework;

//数组查表法(根据键盘录入索引,查找对应星期)

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("星期"+ getWeek(5));
	}
	
	public static char getWeek(int week){
		char[] arr = {' ','一','二','三','四','五','六','日'};
		return arr[week];
	}

}
