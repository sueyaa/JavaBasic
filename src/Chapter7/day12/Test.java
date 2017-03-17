package Chapter7.day12;

public class Test {
	public static void main(String[] args) {
		School sh = new School();
		Print p = new LaserPrinter();
		Document d = new Document();
		Picture pic = new Picture();
		sh.setPrint(p);
		sh.userToPrint(d);
	}
}
