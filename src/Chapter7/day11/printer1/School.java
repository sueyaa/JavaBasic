package Chapter7.day11.printer1;

public class School {
	
	private Print mPrint;//--成员变量以小些m开头.
	private String mName;
	public String getName() {
		return mName;
	}
	public void setName(String name) {
		mName = name;
	}
	
	//--安装打印机.
	public void setPrint(Print print){
		mPrint =print;
	}
	
	//--打印机是自动打印的吗?
	public  void userPrintToPrint(Document document){
		mPrint.printSomething(document);
	}
}
