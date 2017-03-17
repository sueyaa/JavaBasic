package Chapter7.teacher.print;

public class Test {
	public static void main(String[] args) {
		Print print = new LaserPrint();
		School school = new School();
		school.setName("上海中心");
		school.setPrint(print);
		Document d = new LessonPlan();
		d.setContent("明天放假可好!");
		school.userPrintToPrint(d);
		
		
		
	}

}
