package Chapter7.day11.printer1;

public class School {
	
	private Print mPrint;//--��Ա������СЩm��ͷ.
	private String mName;
	public String getName() {
		return mName;
	}
	public void setName(String name) {
		mName = name;
	}
	
	//--��װ��ӡ��.
	public void setPrint(Print print){
		mPrint =print;
	}
	
	//--��ӡ�����Զ���ӡ����?
	public  void userPrintToPrint(Document document){
		mPrint.printSomething(document);
	}
}
