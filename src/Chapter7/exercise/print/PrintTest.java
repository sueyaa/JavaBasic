package Chapter7.exercise.print;

public class PrintTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Center c1 = new ShangHai();
		Print p = new JiGuangPrint();
		Document d = new JianLi();
		Picture pic = new JiaoAn();
		System.out.println(c1.getName());
		c1.setPrint(p);
		c1.userPrint(d);
		c1.userPrint(pic);
	}

}
