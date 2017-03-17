package Chapter8.day13.exercise;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="aaabbbcccdef";
		int length = str.length();
		while(length > 0){
			String tmp = String.valueOf(str.charAt(0));
			str = str.replaceAll(tmp, "");
			System.out.print(length - str.length() + tmp);
			length = str.length();
		}		
	}
}
