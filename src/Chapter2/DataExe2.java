package Chapter2;
import java.util.Scanner;
public class DataExe2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������������֤���룺");
		long l = input.nextLong();
		System.out.println("�������֤����Ϊ��"+l);
		System.out.print("�������������п��ţ�");
		long l2 = input.nextLong();
		System.out.println("�������п���Ϊ��"+l2);
		input.close();
	}
}