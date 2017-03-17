package Chapter5;

//import java.lang.Math;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int number = (int)(Math.random()*100 + 1);
			sum += number;
			System.out.print(number+"\t");
		}
		System.out.println();
		System.out.println("这十个数字的和为："+sum+"，平均数为："+sum/10.0);

	}

}
