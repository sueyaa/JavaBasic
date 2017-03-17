package Chapter2;
import java.util.Scanner;
public class DataExe2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的身份证号码：");
		long l = input.nextLong();
		System.out.println("您的身份证号码为："+l);
		System.out.print("请输入您的银行卡号：");
		long l2 = input.nextLong();
		System.out.println("您的银行卡号为："+l2);
		input.close();
	}
}