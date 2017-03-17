package Chapter2;

public class DataDemo{
	/*如果去掉public，会提示如下错误
	错误: 在类 DataDemo 中找不到 main 方法, 请将 main 方法定义为:
    public static void main(String[] args)
          否则 JavaFX 应用程序类必须扩展javafx.application.Application*/
	public static void main(String[] args){
		//整型数据类型
		byte b = -128;
		short s = 128;
		int i = 128;
		long l = 128L;//长整型的值后面需要加l（L）
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		//浮点型数据类型
		float f = 0.0f;//单精度浮点型的值后面需要加f
		double d = 0.0d;//双精度浮点型的值后面需要加d
		System.out.println(f);
		System.out.println(d);
		
		//char用来表示一个字符且仅限一个字符，中文占两个字节，而char就是两个字节
		//char中有三个值需要注意，A（65），a（97），0（48）
		//在java中char打印的是ascii码
		char c = 1;
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		//布尔类型的数据只有两个值，要么true要么false
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		 
	}
}