package Chapter7.day11.printer1;

public class Test {
	public static void main(String[] args) {
		Print print = new LaserPrint();
		School school = new School();
		school.setName("�Ϻ�����");
		school.setPrint(print);
		Document d = new LessonPlan();
		d.setContent("����żٿɺ�!");
		school.userPrintToPrint(d);
		
		
		
	}

}
