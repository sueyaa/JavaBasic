package Chapter7.day12;

public class LaserPrinter extends Printer{
	
	public void printDocument(Document d) {
		System.out.println(d.getContent());
	}

	public void printPicture(Picture p) {
		System.out.println(p.getContent());	
	}

}
