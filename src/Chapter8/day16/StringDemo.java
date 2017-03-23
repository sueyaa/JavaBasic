package Chapter8.day16;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(Integer.toHexString(str.hashCode()));
		String str1 = new String("abc");
		System.out.println(Integer.toHexString(str1.hashCode()));
		String str2=new String("a"+"b"+"c");
		System.out.println(Integer.toHexString(str2.hashCode()));
		
	}
}
