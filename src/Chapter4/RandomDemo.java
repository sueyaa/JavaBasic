package Chapter4;

import java.lang.Math;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random()*10);
		System.out.println(number);
		if(number > 3){
			System.out.println(number + "大于3");
		} else {
			System.out.println(number + "小于等于3");
		}
	}

}
