package Chapter7.teacher.print;

public class LaserPrint extends Print{
	
	private String description;
	public LaserPrint() {
		description = "�����ӡ��";
	}	
	public String getDescription() {
		return description;
	}

	//@Override ��ע��.��������ķ�������д����.���Ǳ����
	@Override
	public void printSomething(Document document) {
		super.printSomething(document);
		System.out.println(getDescription() + "��ӡ" +document.getDescription()+"����Ϊ:"+document.getContent());
	}
}
