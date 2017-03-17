package Chapter7.teacher.print;

public class LaserPrint extends Print{
	
	private String description;
	public LaserPrint() {
		description = "激光打印机";
	}	
	public String getDescription() {
		return description;
	}

	//@Override 是注解.代表下面的方法是重写方法.不是必须的
	@Override
	public void printSomething(Document document) {
		super.printSomething(document);
		System.out.println(getDescription() + "打印" +document.getDescription()+"内容为:"+document.getContent());
	}
}
