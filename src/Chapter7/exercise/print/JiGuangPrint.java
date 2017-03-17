package Chapter7.exercise.print;

public class JiGuangPrint extends Print{
	private String name;
	
	public JiGuangPrint(){
		name = "激光打印机";
	}
	
	public String getName() {
		return name;
	}

	public void printDocument(Document d){
		System.out.println(getName() + "打印" + d.getName() + ",内容为：" + d.getContent());
	}
	
	public void printPicture(Picture p){
		System.out.println(getName() + "打印" + p.getName() + ",内容为：" + p.getContent());
	}
}
