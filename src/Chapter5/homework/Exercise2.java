package Chapter5.homework;

//
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 2; j2++) {
					a++;
				}
			}
		}
		System.out.println("有1、2、3、4个数字，能组成"+a+"个互不相同且无重复数字的三位数");
	}

}
