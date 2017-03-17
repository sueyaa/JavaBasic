package Chapter8.day13.exercise;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ab";
		String b = new String("ok");
		String bb = "b";
		String ab = "a" + bb;
		System.out.println(a == ab);
		System.out.println(a.hashCode());
		System.out.println(ab.hashCode());
/*		System.out.println(a == b);
		System.out.println(a.equals(b));*/
	}

}
