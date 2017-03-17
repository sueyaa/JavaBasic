package Chapter4;

import java.util.Random;

public class ELseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//,rand.nextInt(100);中的100是随机数的上限,产生的随机数为0-100的整数,不包括100。
		Random  rand = new Random();
		int number = rand.nextInt(90)+10;
		//调用这个Math.Random()函数能够返回带正号的double值，该值大于等于0.0且小于1.0，
		//即取值范围是[0.0,1.0)的左闭右开区间，返回值是一个伪随机选择的数，在该范围内（近似）均匀分布。
	//	int number = (int)(Math.random()*90+10);
		System.out.println(number);
		if(number > 10 && number <= 20){
			System.out.println("在10到20之间");
		} else if(number > 20 && number <= 40){
			System.out.println("在20到40之间");
		} else if(number > 40 && number <= 60){
			System.out.println("在40到60之间");
		} else if(number <= 100){
			System.out.println("在60到100之间");
		}
	}

}
