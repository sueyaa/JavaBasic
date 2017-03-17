package Chapter7.day12;

public class School {
	Print print;

	public void setPrint(Print print) {
		this.print = print;
	}
	
	public void userToPrint(Object obj) {
		if(obj.getClass() == Document.class){
			Document d = (Document) obj;
			print.printDocument(d);
		}else if(obj.getClass() == Picture.class){
			Picture p = (Picture) obj;
			print.printPicture(p);
		}else{
			System.out.println("¿‡–Õ¥ÌŒÛ");
		}
	}
}
