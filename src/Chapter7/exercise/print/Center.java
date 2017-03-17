package Chapter7.exercise.print;

public class Center {
	private Print print;
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Print getPrint() {
		return print;
	}

	public void setPrint(Print print) {
		this.print = print;
	}
	
	public  void userPrint(Document document){
		print.printDocument(document);
	}
	
	public  void userPrint(Picture p){
		print.printPicture(p);
	}
}
