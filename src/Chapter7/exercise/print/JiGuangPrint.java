package Chapter7.exercise.print;

public class JiGuangPrint extends Print{
	private String name;
	
	public JiGuangPrint(){
		name = "�����ӡ��";
	}
	
	public String getName() {
		return name;
	}

	public void printDocument(Document d){
		System.out.println(getName() + "��ӡ" + d.getName() + ",����Ϊ��" + d.getContent());
	}
	
	public void printPicture(Picture p){
		System.out.println(getName() + "��ӡ" + p.getName() + ",����Ϊ��" + p.getContent());
	}
}
