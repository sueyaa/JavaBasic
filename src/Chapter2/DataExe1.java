package Chapter2;
public class DataExe1{
	public static void main(String[] args){
		char c1 = 3;
		char c2 = 4;
		char c3 = 5;
		char c4 = 6;
		char c5 = (char)(c1 + c2 + c3 + c4);
		//所有的char在运算时第一件事情是转换成int，除了char还有byte和short在运算时也会先转换成int，如果仅仅只是输出不会转换
		System.out.println(c1+"+"+c2+"+"+c3+"+"+c4+"="+c5);
	}
}