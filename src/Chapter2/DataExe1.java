package Chapter2;
public class DataExe1{
	public static void main(String[] args){
		char c1 = 3;
		char c2 = 4;
		char c3 = 5;
		char c4 = 6;
		char c5 = (char)(c1 + c2 + c3 + c4);
		//���е�char������ʱ��һ��������ת����int������char����byte��short������ʱҲ����ת����int���������ֻ���������ת��
		System.out.println(c1+"+"+c2+"+"+c3+"+"+c4+"="+c5);
	}
}